package com.proyectoSemana.dto;

import com.proyectoSemana.model.Alumno;
import com.proyectoSemana.model.AsignaturaCurso;
import com.proyectoSemana.model.Profesor;

import java.util.List;

public class ResponseCursoDto {
    private String nombreCursoDto;
    private List<Alumno> alumnoListDto;
    private List<Profesor> profesorListDto;
    private List<AsignaturaCurso> asignaturaCursoListDto;

    public String getNombreCursoDto() {
        return nombreCursoDto;
    }

    public void setNombreCursoDto(String nombreCursoDto) {
        this.nombreCursoDto = nombreCursoDto;
    }

    public List<Alumno> getAlumnoListDto() {
        return alumnoListDto;
    }

    public void setAlumnoListDto(List<Alumno> alumnoListDto) {
        this.alumnoListDto = alumnoListDto;
    }

    public List<Profesor> getProfesorListDto() {
        return profesorListDto;
    }

    public void setProfesorListDto(List<Profesor> profesorListDto) {
        this.profesorListDto = profesorListDto;
    }

    public List<AsignaturaCurso> getAsignaturaCursoListDto() {
        return asignaturaCursoListDto;
    }

    public void setAsignaturaCursoListDto(List<AsignaturaCurso> asignaturaCursoListDto) {
        this.asignaturaCursoListDto = asignaturaCursoListDto;
    }
}
