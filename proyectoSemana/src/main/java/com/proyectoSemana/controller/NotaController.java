package com.proyectoSemana.controller;

import com.proyectoSemana.dto.ReqNotaAlumnoAsignaturaDto;
import com.proyectoSemana.exception.NoEncontradoException;
import com.proyectoSemana.exception.NoGuardarException;
import com.proyectoSemana.imp.NotaImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/notas")
public class NotaController {

    @Autowired
    private NotaImp notaImp;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> guardarNotas(@RequestBody ReqNotaAlumnoAsignaturaDto reqNotaAlumnoAsignaturaDto) {
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(notaImp.agregarNotas(reqNotaAlumnoAsignaturaDto), HttpStatus.OK);
        } catch (NoGuardarException ex) {
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE);
        } catch (Exception ex) {
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return rs;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> buscarNotasPorId(@PathVariable Long id){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(notaImp.buscarNotaPorId(id),HttpStatus.OK);
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
