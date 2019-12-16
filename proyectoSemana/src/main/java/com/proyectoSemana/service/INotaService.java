package com.proyectoSemana.service;

import com.proyectoSemana.dto.*;
import com.proyectoSemana.model.Nota;

public interface INotaService {
    ResponseNotaDto agregarNotas(ReqNotaAlumnoAsignaturaDto reqNotaAlumnoAsignaturaDto) throws Exception;
    Nota buscarNotaPorId(Long id) throws Exception;
}
