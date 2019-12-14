package com.proyectoSemana.dto;

import com.proyectoSemana.model.Asignatura;
import com.proyectoSemana.model.Curso;

public class ResponseAsignaturaCursoDto {
    private Curso cursoDto;
    private Asignatura asignaturaDto;

    public Curso getCursoDto() {
        return cursoDto;
    }

    public void setCursoDto(Curso cursoDto) {
        this.cursoDto = cursoDto;
    }

    public Asignatura getAsignaturaDto() {
        return asignaturaDto;
    }

    public void setAsignaturaDto(Asignatura asignaturaDto) {
        this.asignaturaDto = asignaturaDto;
    }
}
