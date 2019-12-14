package com.proyectoSemana.service;

import com.proyectoSemana.dto.*;


public interface IProfesorService {
    boolean validarProfesor(ReqProfesorDto reqProfesorDto) throws Exception;
    ResponseProfesorDto guardarProfesor(ReqProfesorDto reqProfesorDto) throws Exception;
    ResponseCursoDto crearCurso(ReqProfesorDto reqProfesorDto, ReqCursoDto reqCursoDto) throws Exception;
    ResponseCursoDto guardarAsignatura(ReqProfesorDto reqProfesorDto, ReqAsignaturaDto reqAsignaturaDto) throws Exception;

    boolean eliminarAlumno(Long id_alumno) throws Exception;


    ResponseLoginDto actualizarAlumno(Long id_alumno, ReqAlumnoDto reqAlumnoDto) throws Exception;
}
