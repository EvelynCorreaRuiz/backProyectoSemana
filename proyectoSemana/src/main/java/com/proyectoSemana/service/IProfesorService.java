package com.proyectoSemana.service;

import com.proyectoSemana.dto.*;
import com.proyectoSemana.model.Curso;
import com.proyectoSemana.model.Login;


public interface IProfesorService {
    boolean validarProfesor(ReqProfesorDto reqProfesorDto) throws Exception;

    ResponseProfesorDto guardarProfesor(ReqProfesorDto reqProfesorDto, Login login, Curso curso) throws Exception;

    ResponseCursoDto guardarAsignatura(ReqProfesorDto reqProfesorDto, ReqAsignaturaDto reqAsignaturaDto) throws Exception;

    boolean eliminarAlumno(Long id_alumno) throws Exception;
}
