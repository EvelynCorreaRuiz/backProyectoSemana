package com.proyectoSemana.dto;

public class ReqAlumnoDto {
    private Long id_alumnoDto;
    private Long id_login;
    private Long id_curso;
    private Long id_profesor;
    private String nombre_AlumnoDto;
    private String apellido_AlumnoDto;
    private String rut_AlumnoDto;


    public Long getId_alumnoDto() {
        return id_alumnoDto;
    }

    public void setId_alumnoDto(Long id_alumnoDto) {
        this.id_alumnoDto = id_alumnoDto;
    }

    public Long getId_login() {
        return id_login;
    }

    public void setId_login(Long id_login) {
        this.id_login = id_login;
    }

    public Long getId_curso() {
        return id_curso;
    }

    public void setId_curso(Long id_curso) {
        this.id_curso = id_curso;
    }

    public Long getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(Long id_profesor) {
        this.id_profesor = id_profesor;
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
