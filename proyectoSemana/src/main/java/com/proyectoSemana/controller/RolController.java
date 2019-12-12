package com.proyectoSemana.controller;

import com.proyectoSemana.dto.ReqRolDto;
import com.proyectoSemana.exception.NoGuardarException;
import com.proyectoSemana.imp.RolImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/roles")
public class RolController {

    @Autowired
    private RolImp rolImp;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> guardarRol(@RequestBody ReqRolDto reqRolDto) {
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(rolImp.guardarRol(reqRolDto), HttpStatus.OK);
        } catch (NoGuardarException ex) {
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE);
        } catch (Exception ex) {
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return rs;
    }
}
