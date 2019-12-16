package com.proyectoSemana.service;

import com.proyectoSemana.dto.*;

public interface INotaService {
    ResponseNotaDto agregarNotas(ReqNotaAlumnoAsignaturaDto reqNotaAlumnoAsignaturaDto) throws Exception;
}
