package com.proyectoSemana.controller;

import com.proyectoSemana.dto.ReqCursoDto;
import com.proyectoSemana.exception.NoEncontradoException;
import com.proyectoSemana.exception.NoGuardarException;
import com.proyectoSemana.imp.CursoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/v1/cursos")
public class CursoController {

    @Autowired
    private CursoImp cursoImp;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> agregarCurso(@RequestBody ReqCursoDto reqCursoDto) {
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(cursoImp.guardarCurso(reqCursoDto), HttpStatus.OK);

        } catch (NoGuardarException ex) {
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE);
        } catch (Exception ex) {
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return rs;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<Object> buscarCursoPorId(@PathVariable Long id){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(cursoImp.buscarCursoPorId(id),HttpStatus.OK);
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
