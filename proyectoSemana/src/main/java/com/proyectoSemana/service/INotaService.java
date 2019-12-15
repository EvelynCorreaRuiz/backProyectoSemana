package com.proyectoSemana.service;

import com.proyectoSemana.dto.ReqAlumnoDto;
import com.proyectoSemana.dto.ReqAsignaturaDto;
import com.proyectoSemana.dto.ReqNotaDto;
import com.proyectoSemana.dto.ResponseNotaDto;
import com.proyectoSemana.model.Alumno;
import com.proyectoSemana.model.Asignatura;


public interface INotaService {
    double calcularPromedioNotas(ReqNotaDto reqNotaDto) throws Exception;
    double calcularPromedioControles(ReqNotaDto reqNotaDto) throws Exception;
    ResponseNotaDto agregarNota1(double nota1, ReqAlumnoDto reqAlumnoDto, ReqAsignaturaDto reqAsignaturaDto) throws Exception;
    /*double agregarNota2(ReqNotaDto reqNotaDto) throws Exception;
    double agregarNota3(ReqNotaDto reqNotaDto) throws Exception;
    double agregarNota4(ReqNotaDto reqNotaDto) throws Exception;
    double agregarControl1(ReqNotaDto reqNotaDto) throws Exception;
    double agregarControl2(ReqNotaDto reqNotaDto) throws Exception;
    double agregarControl3(ReqNotaDto reqNotaDto) throws Exception;
    double agregarControl4(ReqNotaDto reqNotaDto) throws Exception;
    double guardarPromedioNotas(ReqNotaDto reqNotaDto) throws Exception;
    double guardarPromedioControl(ReqNotaDto reqNotaDto) throws Exception;*/
}
