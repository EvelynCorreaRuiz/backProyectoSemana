package com.proyectoSemana.service;

import com.proyectoSemana.dto.ReqRolDto;
import com.proyectoSemana.dto.ResponseRolDto;
import com.proyectoSemana.model.Rol;

public interface IRolService {

    ResponseRolDto guardarRol(ReqRolDto reqRolDto) throws Exception;
    Rol buscarRolporId(Long id) throws Exception;
}
