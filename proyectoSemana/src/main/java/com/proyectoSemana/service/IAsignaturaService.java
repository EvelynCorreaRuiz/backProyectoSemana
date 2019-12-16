package com.proyectoSemana.service;

import com.proyectoSemana.dto.ReqAsignaturaDto;
import com.proyectoSemana.dto.ResponseAsignaturaDto;

public interface IAsignaturaService {
    ResponseAsignaturaDto guardarAsignatura(ReqAsignaturaDto asignatura) throws Exception;
}
