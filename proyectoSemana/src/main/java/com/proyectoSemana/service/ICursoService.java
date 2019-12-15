package com.proyectoSemana.service;

import com.proyectoSemana.dto.ReqCursoDto;
import com.proyectoSemana.dto.ReqProfesorDto;
import com.proyectoSemana.dto.ResponseCursoDto;
import com.proyectoSemana.model.Curso;

public interface ICursoService  {
    ResponseCursoDto guardarCurso(ReqCursoDto reqCursoDto) throws Exception;
    Curso buscarCursoPorId(Long idCurso) throws Exception;
}
