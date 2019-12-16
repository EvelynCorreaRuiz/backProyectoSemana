package com.proyectoSemana.service;

import com.proyectoSemana.dto.ReqAsignaturaDto;
import com.proyectoSemana.dto.ResponseAsignaturaDto;
import com.proyectoSemana.model.Asignatura;

public interface IAsignaturaService {
    ResponseAsignaturaDto guardarAsignatura(ReqAsignaturaDto asignatura) throws Exception;
    Asignatura buscarIdAsignatura(Long id) throws Exception;
}
