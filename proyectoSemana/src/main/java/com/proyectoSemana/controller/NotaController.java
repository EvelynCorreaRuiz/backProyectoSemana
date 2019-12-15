package com.proyectoSemana.controller;

import com.proyectoSemana.dto.ReqAlumnoDto;
import com.proyectoSemana.dto.ReqAsignaturaDto;
import com.proyectoSemana.dto.ReqNotaDto;
import com.proyectoSemana.exception.NoGuardarException;
import com.proyectoSemana.imp.NotaImp;
import com.proyectoSemana.model.Alumno;
import com.proyectoSemana.model.Asignatura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/notas")
public class NotaController {

    @Autowired
    private NotaImp notaImp;

    @RequestMapping(value = "/nota1", method = RequestMethod.POST)
    public ResponseEntity<Object> agregarNota1(@RequestBody double nota1, ReqAlumnoDto reqAlumnoDto, ReqAsignaturaDto reqAsignaturaDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(notaImp.agregarNota1(nota1,reqAlumnoDto, reqAsignaturaDto), HttpStatus.OK);
        }catch (NoGuardarException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_IMPLEMENTED);
        }catch (Exception ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return rs;
    }

    /*@RequestMapping(value = "/nota2", method = RequestMethod.POST)
    public ResponseEntity<Object> agregarNota2(@RequestBody ReqNotaDto reqNotaDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(notaImp.agregarNota2(reqNotaDto), HttpStatus.OK);
        }catch (NoGuardarException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_IMPLEMENTED);
        }catch (Exception ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return rs;
    }

    @RequestMapping(value = "/nota3", method = RequestMethod.POST)
    public ResponseEntity<Object> agregarNota3(@RequestBody ReqNotaDto reqNotaDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(notaImp.agregarNota3(reqNotaDto), HttpStatus.OK);
        }catch (NoGuardarException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_IMPLEMENTED);
        }catch (Exception ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return rs;
    }

    @RequestMapping(value = "/nota4", method = RequestMethod.POST)
    public ResponseEntity<Object> agregarNota4(@RequestBody ReqNotaDto reqNotaDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(notaImp.agregarNota4(reqNotaDto), HttpStatus.OK);
        }catch (NoGuardarException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_IMPLEMENTED);
        }catch (Exception ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return rs;
    }

    @RequestMapping(value = "/control1", method = RequestMethod.POST)
    public ResponseEntity<Object> agregarControl1(@RequestBody ReqNotaDto reqNotaDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(notaImp.agregarControl1(reqNotaDto), HttpStatus.OK);
        }catch (NoGuardarException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_IMPLEMENTED);
        }catch (Exception ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return rs;
    }

    @RequestMapping(value = "/control2", method = RequestMethod.POST)
    public ResponseEntity<Object> agregarControl2(@RequestBody ReqNotaDto reqNotaDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(notaImp.agregarControl2(reqNotaDto), HttpStatus.OK);
        }catch (NoGuardarException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_IMPLEMENTED);
        }catch (Exception ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return rs;
    }

    @RequestMapping(value = "/control3", method = RequestMethod.POST)
    public ResponseEntity<Object> agregarControl3(@RequestBody ReqNotaDto reqNotaDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(notaImp.agregarControl3(reqNotaDto), HttpStatus.OK);
        }catch (NoGuardarException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_IMPLEMENTED);
        }catch (Exception ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return rs;
    }

    @RequestMapping(value = "/control4", method = RequestMethod.POST)
    public ResponseEntity<Object> agregarControl4(@RequestBody ReqNotaDto reqNotaDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(notaImp.agregarControl4(reqNotaDto), HttpStatus.OK);
        }catch (NoGuardarException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_IMPLEMENTED);
        }catch (Exception ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return rs;
    }

    @RequestMapping(value = "/promedio_notas", method = RequestMethod.POST)
    public ResponseEntity<Object> agregarPromedioNotas(@RequestBody ReqNotaDto reqNotaDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(notaImp.guardarPromedioNotas(reqNotaDto), HttpStatus.OK);
        }catch (NoGuardarException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_IMPLEMENTED);
        }catch (Exception ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return rs;
    }

    @RequestMapping(value = "/promedio_controles", method = RequestMethod.POST)
    public ResponseEntity<Object> agregarPromedioControles(@RequestBody ReqNotaDto reqNotaDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(notaImp.guardarPromedioControl(reqNotaDto), HttpStatus.OK);
        }catch (NoGuardarException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_IMPLEMENTED);
        }catch (Exception ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);

        }
        return rs;
    }*/
}
