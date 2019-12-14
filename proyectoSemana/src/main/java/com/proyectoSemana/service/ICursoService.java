package com.proyectoSemana.service;

import com.proyectoSemana.dto.ReqCursoDto;
import com.proyectoSemana.dto.ReqProfesorDto;
import com.proyectoSemana.dto.ResponseCursoDto;

public interface ICursoService  {
    ResponseCursoDto guardarCurso(ReqProfesorDto reqProfesorDto, ReqCursoDto reqCursoDto) throws Exception;
    boolean validarCurso(ReqCursoDto reqCursoDto, ReqProfesorDto reqProfesorDto) throws Exception;
}
