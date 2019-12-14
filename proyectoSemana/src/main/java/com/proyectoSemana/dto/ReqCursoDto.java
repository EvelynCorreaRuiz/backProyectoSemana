package com.proyectoSemana.dto;

import com.proyectoSemana.model.Alumno;
import com.proyectoSemana.model.AsignaturaCurso;
import com.proyectoSemana.model.Profesor;

import java.util.List;

public class ReqCursoDto {
    private Long id_cursoDto;
    private String nombreCursoDto;
    private List<Profesor> profesorListDto;
    private List<Alumno> alumnoListDto;
    private List<AsignaturaCurso> asignaturaCursoListDto;

    public Long getId_cursoDto() {
        return id_cursoDto;
    }

    public void setId_cursoDto(Long id_cursoDto) {
        this.id_cursoDto = id_cursoDto;
    }

    public String getNombreCursoDto() {
        return nombreCursoDto;
    }

    public void setNombreCursoDto(String nombreCursoDto) {
        this.nombreCursoDto = nombreCursoDto;
    }

    public List<Profesor> getProfesorListDto() {
        return profesorListDto;
    }

    public void setProfesorListDto(List<Profesor> profesorListDto) {
        this.profesorListDto = profesorListDto;
    }

    public List<Alumno> getAlumnoListDto() {
        return alumnoListDto;
    }

    public void setAlumnoListDto(List<Alumno> alumnoListDto) {
        this.alumnoListDto = alumnoListDto;
    }

    public List<AsignaturaCurso> getAsignaturaCursoListDto() {
        return asignaturaCursoListDto;
    }

    public void setAsignaturaCursoListDto(List<AsignaturaCurso> asignaturaCursoListDto) {
        this.asignaturaCursoListDto = asignaturaCursoListDto;

    }
}
