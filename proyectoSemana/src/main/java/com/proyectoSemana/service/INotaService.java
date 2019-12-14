package com.proyectoSemana.service;

import com.proyectoSemana.dto.ReqNotaDto;
import com.proyectoSemana.model.Nota;

public interface INotaService {
    double calcularPromedioNotas(ReqNotaDto reqNotaDto) throws Exception;
}
