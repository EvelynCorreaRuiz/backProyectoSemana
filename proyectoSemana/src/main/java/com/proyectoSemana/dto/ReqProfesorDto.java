package com.proyectoSemana.dto;

import com.proyectoSemana.model.Curso;
import com.proyectoSemana.model.Login;

public class ReqProfesorDto {
    private Long idProfesorDto;
    private String nombre_ProfesorDto;
    private String apellido_ProfesorDto;
    private String rut_ProfesorDto;
    private Login loginDto;
    private Curso cursoDto;

    public String getNombre_ProfesorDto() {return nombre_ProfesorDto;}

    public void setNombre_ProfesorDto(String nombre_ProfesorDto) {this.nombre_ProfesorDto = nombre_ProfesorDto;}

    public String getApellido_ProfesorDto() {return apellido_ProfesorDto;}

    public void setApellido_ProfesorDto(String apellido_ProfesorDto) {this.apellido_ProfesorDto = apellido_ProfesorDto;}

    public String getRut_ProfesorDto() {return rut_ProfesorDto;}

    public void setRut_ProfesorDto(String rut_ProfesorDto) {this.rut_ProfesorDto = rut_ProfesorDto;}

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

    public Long getIdProfesorDto() {
        return idProfesorDto;
    }

    public void setIdProfesorDto(Long idProfesorDto) {
        this.idProfesorDto = idProfesorDto;
    }
}
