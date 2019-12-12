package com.proyectoSemana.controller;

import com.proyectoSemana.dto.ReqLoginDto;
import com.proyectoSemana.exception.NoActualizarException;
import com.proyectoSemana.exception.NoEncontradoException;
import com.proyectoSemana.exception.NoGuardarException;
import com.proyectoSemana.exception.NoValidarSesionException;
import com.proyectoSemana.imp.LoginImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1/logins")
public class LoginController {

    @Autowired
    private LoginImp loginImp;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Object> guardarLogin(@RequestBody ReqLoginDto loginDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(loginImp.guardarLogin(loginDto), HttpStatus.OK) ;
        }catch (NoGuardarException ex){
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE) ;
        }catch (Exception ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
        return  rs;
    }

    @RequestMapping(value = "/sessions",method = RequestMethod.POST)
    public ResponseEntity<Object> validarSession(@RequestBody ReqLoginDto loginDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(loginImp.validarSession(loginDto), HttpStatus.OK);
        }catch (NoValidarSesionException ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.UNAUTHORIZED) ;
        }catch (Exception ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
        return  rs;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<Object> buscarPorId(@PathVariable Long id){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(loginImp.buscarPorId(id), HttpStatus.OK);
        }catch (NoEncontradoException ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND) ;
        }catch (Exception ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
        return  rs;
    }

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Object> listarLogin(){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(loginImp.listarLogin(), HttpStatus.OK);
        }catch (NoEncontradoException ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND) ;
        }catch (Exception ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
        return  rs;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<Object> eliminarLogin(@PathVariable Long id){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(loginImp.eliminarLogin(id), HttpStatus.OK);
        }catch (NoEncontradoException ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND) ;
        }catch (Exception ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
        return  rs;
    }
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public ResponseEntity<Object> actualizarLogin(@PathVariable Long id, @RequestBody ReqLoginDto reqLoginDto){
        ResponseEntity<Object> rs = null;
        try {
            rs = new ResponseEntity<Object>(loginImp.actualizarLogin(id,reqLoginDto), HttpStatus.OK);
        }catch (NoActualizarException ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE) ;
        }catch (NoEncontradoException ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.NOT_FOUND) ;
        }catch (Exception ex){
            ex.printStackTrace();
            rs = new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR) ;
        }
        return  rs;
    }
}
