package com.proyectoSemana.dto;

import com.proyectoSemana.model.Curso;
import com.proyectoSemana.model.Login;

public class ReqAlumnoDto {
    private Long id_alumnoDto;
    private String nombre_AlumnoDto;
    private String apellido_AlumnoDto;
    private String rut_AlumnoDto;
    private Login loginDto;
    private Curso cursoDto;

    public Long getId_alumnoDto() {
        return id_alumnoDto;
    }

    public void setId_alumnoDto(Long id_alumnoDto) {
        this.id_alumnoDto = id_alumnoDto;
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

    public Login getLoginDto() {
        return loginDto;
    }

    public void setLoginDto(Login loginDto) {
        this.loginDto = loginDto;
    }

    public Curso getCursoDto() {
        return cursoDto;
    }

    public void setCursoDto(Curso cursoDto) {
        this.cursoDto = cursoDto;
    }
}
