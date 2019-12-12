package com.proyectoSemana.dto;

public class ReqAlumnoDto {
    private String nombre_Alumno;
    private String apellido_Alumno;
    private String rut_Alumno;

    public String getNombre_Alumno() {
        return nombre_Alumno;
    }

    public void setNombre_Alumno(String nombre_Alumno) {
        this.nombre_Alumno = nombre_Alumno;
    }

    public String getApellido_Alumno() {
        return apellido_Alumno;
    }

    public void setApellido_Alumno(String apellido_Alumno) {
        this.apellido_Alumno = apellido_Alumno;
    }

    public String getRut_Alumno() {
        return rut_Alumno;
    }

    public void setRut_Alumno(String rut_Alumno) {
        this.rut_Alumno = rut_Alumno;
    }
}
