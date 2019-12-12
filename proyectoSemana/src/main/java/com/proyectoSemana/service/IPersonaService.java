package com.proyectoSemana.service;

import com.proyectoSemana.dto.ReqPersonaDto;
import com.proyectoSemana.dto.ResponsePersonaDto;

public interface IPersonaService {
    ResponsePersonaDto guardarPersona(ReqPersonaDto persona) throws Exception;
}
