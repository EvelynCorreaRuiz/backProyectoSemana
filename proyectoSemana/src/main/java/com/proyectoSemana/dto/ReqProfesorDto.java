package com.proyectoSemana.dto;

public class ReqProfesorDto {
    private Long idProfesorDto;
    private Long idLoginDto;
    private Long idCursoDto;
    private String nombre_ProfesorDto;
    private String apellido_ProfesorDto;
    private String rut_ProfesorDto;

    public Long getIdProfesorDto() {
        return idProfesorDto;
    }

    public void setIdProfesorDto(Long idProfesorDto) {
        this.idProfesorDto = idProfesorDto;
    }

    public Long getIdLoginDto() {
        return idLoginDto;
    }

    public void setIdLoginDto(Long idLoginDto) {
        this.idLoginDto = idLoginDto;
    }

    public Long getIdCursoDto() {
        return idCursoDto;
    }

    public void setIdCursoDto(Long idCursoDto) {
        this.idCursoDto = idCursoDto;
    }

    public String getNombre_ProfesorDto() {return nombre_ProfesorDto;}

    public void setNombre_ProfesorDto(String nombre_ProfesorDto) {this.nombre_ProfesorDto = nombre_ProfesorDto;}

    public String getApellido_ProfesorDto() {return apellido_ProfesorDto;}

    public void setApellido_ProfesorDto(String apellido_ProfesorDto) {this.apellido_ProfesorDto = apellido_ProfesorDto;}

    public String getRut_ProfesorDto() {return rut_ProfesorDto;}

    public void setRut_ProfesorDto(String rut_ProfesorDto) {this.rut_ProfesorDto = rut_ProfesorDto;}

}
