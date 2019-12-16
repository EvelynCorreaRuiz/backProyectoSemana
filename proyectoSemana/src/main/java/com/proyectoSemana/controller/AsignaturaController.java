package com.proyectoSemana.controller;

import com.proyectoSemana.dto.ReqAsignaturaDto;
import com.proyectoSemana.exception.NoEncontradoException;
import com.proyectoSemana.exception.NoGuardarException;
import com.proyectoSemana.imp.AsignaturaImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/asignaturas")
public class AsignaturaController {

    @Autowired
    private AsignaturaImp asignaturaImp;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> guardarLogin(@RequestBody ReqAsignaturaDto reqAsignaturaDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(asignaturaImp.guardarAsignatura(reqAsignaturaDto), HttpStatus.OK) ;
        }catch (NoGuardarException ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE) ;
        }catch (Exception ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
        return rs;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<Object> buscarAsignaturaPorId(@PathVariable Long id){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(asignaturaImp.buscarIdAsignatura(id),HttpStatus.OK);
        }catch (NoEncontradoException ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND) ;
        }catch (Exception ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
        return rs;
    }
}
