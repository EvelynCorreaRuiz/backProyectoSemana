package com.proyectoSemana.service;

import com.proyectoSemana.dto.ReqNotaDto;
import com.proyectoSemana.dto.ResponseNotaDto;
import com.proyectoSemana.model.Nota;

public interface INotaService {
    double calcularPromedioNotas(ReqNotaDto reqNotaDto) throws Exception;
    double agregarNota1(ReqNotaDto reqNotaDto) throws Exception;
    double agregarNota2(ReqNotaDto reqNotaDto) throws Exception;
    double agregarNota3(ReqNotaDto reqNotaDto) throws Exception;
    double agregarNota4(ReqNotaDto reqNotaDto) throws Exception;
    double agregarControl1(ReqNotaDto reqNotaDto) throws Exception;
    double agregarControl2(ReqNotaDto reqNotaDto) throws Exception;
    double agregarControl3(ReqNotaDto reqNotaDto) throws Exception;
    double agregarControl4(ReqNotaDto reqNotaDto) throws Exception;
    double guardarPromedioNotas(ResponseNotaDto responseNotaDto) throws  Exception;
    double guardarControlNotas(ResponseNotaDto responseNotaDto) throws Exception;
}
