package com.proyectoSemana.controller;

import com.proyectoSemana.dto.ReqAlumnoDto;
import com.proyectoSemana.exception.NoGuardarException;
import com.proyectoSemana.imp.AlumnoImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/alumnos")
public class AlumnoController {

    @Autowired
    private AlumnoImp alumnoImp;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> guardarAlumno(@RequestBody ReqAlumnoDto reqAlumnoDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(alumnoImp.guardarAlumno(reqAlumnoDto), HttpStatus.OK);
        }catch (NoGuardarException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE);
        }catch (Exception ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return rs;
    }
}
