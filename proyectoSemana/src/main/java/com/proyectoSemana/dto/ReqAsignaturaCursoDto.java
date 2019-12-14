package com.proyectoSemana.dto;

import com.proyectoSemana.model.Asignatura;
import com.proyectoSemana.model.Curso;

public class ReqAsignaturaCursoDto {
    private Long id_AsignaturaCursoDto;
    private Asignatura asignaturaDto;
    private Curso cursoDto;

    public Long getId_AsignaturaCursoDto() {
        return id_AsignaturaCursoDto;
    }

    public void setId_AsignaturaCursoDto(Long id_AsignaturaCursoDto) {
        this.id_AsignaturaCursoDto = id_AsignaturaCursoDto;
    }

    public Asignatura getAsignaturaDto() {
        return asignaturaDto;
    }

    public void setAsignaturaDto(Asignatura asignaturaDto) {
        this.asignaturaDto = asignaturaDto;
    }

    public Curso getCursoDto() {
        return cursoDto;
    }

    public void setCursoDto(Curso cursoDto) {
        this.cursoDto = cursoDto;
    }
}
