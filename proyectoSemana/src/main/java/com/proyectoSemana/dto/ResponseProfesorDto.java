package com.proyectoSemana.dto;

public class ResponseProfesorDto {
    private String nombre_ProfesorDto;
    private String apellido_ProfesorDto;
    private String rut_ProfesorDto;

    public String getNombre_Profesor() {return nombre_ProfesorDto;}

    public void setNombre_Profesor(String nombre_Profesor) {this.nombre_ProfesorDto = nombre_Profesor;}

    public String getApellido_Profesor() {return apellido_ProfesorDto;}

    public void setApellido_Profesor(String apellido_Profesor) {this.apellido_ProfesorDto = apellido_Profesor;}

    public String getRut_Profesor() {return rut_ProfesorDto;}

    public void setRut_Profesor(String rut_Profesor) {this.rut_ProfesorDto = rut_Profesor;}
}
