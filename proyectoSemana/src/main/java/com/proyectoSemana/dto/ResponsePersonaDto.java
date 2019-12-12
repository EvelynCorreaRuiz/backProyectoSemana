package com.proyectoSemana.dto;

import java.util.Date;

public class ResponsePersonaDto {

    private String nombrePersonaDto;
    private String apellidoPersonaDto;
    private String rutPersonaDto;
    private String tipoRolDto;
    private String emailLoginDto;

    public String getNombrePersonaDto() {
        return nombrePersonaDto;
    }

    public void setNombrePersonaDto(String nombrePersonaDto) {
        this.nombrePersonaDto = nombrePersonaDto;
    }

    public String getApellidoPersonaDto() {
        return apellidoPersonaDto;
    }

    public void setApellidoPersonaDto(String apellidoPersonaDto) {
        this.apellidoPersonaDto = apellidoPersonaDto;
    }

    public String getRutPersonaDto() {
        return rutPersonaDto;
    }

    public void setRutPersonaDto(String rutPersonaDto) {
        this.rutPersonaDto = rutPersonaDto;
    }

    public String getTipoRolDto() {
        return tipoRolDto;
    }

    public void setTipoRolDto(String tipoRolDto) {
        this.tipoRolDto = tipoRolDto;
    }

    public String getEmailLoginDto() {
        return emailLoginDto;
    }

    public void setEmailLoginDto(String emailLoginDto) {
        this.emailLoginDto = emailLoginDto;
    }
}
