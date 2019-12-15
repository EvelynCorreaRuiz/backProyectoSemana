package com.proyectoSemana.service;

import com.proyectoSemana.dto.*;
import com.proyectoSemana.model.Curso;
import com.proyectoSemana.model.Login;
import com.proyectoSemana.model.Profesor;


public interface IProfesorService {
    ResponseProfesorDto guardarProfesor(ReqProfesorDto reqProfesorDto) throws Exception;

    Profesor buscarProfesorPorId(Long id) throws Exception;

}
