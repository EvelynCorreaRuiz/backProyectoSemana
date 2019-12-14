package com.proyectoSemana.dto;

import com.proyectoSemana.model.Curso;
import com.proyectoSemana.model.Nota;

import java.util.List;

public class ResponseAlumnoDto {
    private String nombre_AlumnoDto;
    private String apellido_AlumnoDto;
    private String rut_AlumnoDto;
    private List<Nota> notaListDto;
    private Curso curso;

    public List<Nota> getNotaListDto() {
        return notaListDto;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public void setNotaListDto(List<Nota> notaListDto) {
        this.notaListDto = notaListDto;
    }

    public String getNombre_AlumnoDto() {
        return nombre_AlumnoDto;
    }

    public void setNombre_AlumnoDto(String nombre_AlumnoDto) {
        this.nombre_AlumnoDto = nombre_AlumnoDto;
    }

    public String getApellido_AlumnoDto() {
        return apellido_AlumnoDto;
    }

    public void setApellido_AlumnoDto(String apellido_AlumnoDto) {
        this.apellido_AlumnoDto = apellido_AlumnoDto;
    }

    public String getRut_AlumnoDto() {
        return rut_AlumnoDto;
    }

    public void setRut_AlumnoDto(String rut_AlumnoDto) {
        this.rut_AlumnoDto = rut_AlumnoDto;
    }
}
