package com.proyectoSemana.service;

import com.proyectoSemana.dto.ReqCursoDto;
import com.proyectoSemana.dto.ResponseCursoDto;

public interface ICursoService  {
    ResponseCursoDto guardarCurso(ReqCursoDto reqCursoDto) throws Exception;

    boolean validarCurso(ReqCursoDto reqCursoDto) throws Exception;
}
