package com.proyectoSemana.dto;

public class ReqProfesorDto {
    private Long idProfesorDto;
    private Long idLoginDto;
    private Long idCursoDto;
    private String nombreProfesorDto;
    private String apellidoProfesorDto;
    private String rutProfesorDto;

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

    public String getNombreProfesorDto() {return nombreProfesorDto;}

    public void setNombreProfesorDto(String nombreProfesorDto) {this.nombreProfesorDto = nombreProfesorDto;}

    public String getApellidoProfesorDto() {return apellidoProfesorDto;}

    public void setApellidoProfesorDto(String apellidoProfesorDto) {this.apellidoProfesorDto = apellidoProfesorDto;}

    public String getRutProfesorDto() {return rutProfesorDto;}

    public void setRutProfesorDto(String rutProfesorDto) {this.rutProfesorDto = rutProfesorDto;}

}
