package com.proyectoSemana.dto;

public class ReqLoginDto {
    private Long id_loginDto;
    private String emailDto;
    private String passwordDto;

    public Long getId_loginDto() {
        return id_loginDto;
    }

    public void setId_loginDto(Long id_loginDto) {
        this.id_loginDto = id_loginDto;
    }

    public String getEmailDto() {
        return emailDto;
    }

    public void setEmailDto(String emailDto) {
        this.emailDto = emailDto;
    }

    public String getPasswordDto() {
        return passwordDto;
    }

    public void setPasswordDto(String passwordDto) {
        this.passwordDto = passwordDto;
    }
}
