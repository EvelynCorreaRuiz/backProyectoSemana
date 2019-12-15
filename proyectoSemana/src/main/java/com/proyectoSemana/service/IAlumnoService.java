package com.proyectoSemana.service;

import com.proyectoSemana.dto.ReqAlumnoDto;
import com.proyectoSemana.dto.ResponseAlumnoDto;

public interface IAlumnoService {
   ResponseAlumnoDto guardarAlumno(ReqAlumnoDto alumno) throws Exception;

}
