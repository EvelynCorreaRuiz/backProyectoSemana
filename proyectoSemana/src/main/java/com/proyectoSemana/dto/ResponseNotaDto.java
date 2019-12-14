package com.proyectoSemana.dto;

public class ResponseNotaDto {

    private int nota1Dto;
    private int nota2Dto;
    private int nota3Dto;
    private int nota4Dto;
    private int control1Dto;
    private int control2Dto;
    private int control3Dto;
    private int control4Dto;
    private int promedioNotasDto;
    private int promedioControlesDto;

    public int getNota1Dto() {
        return nota1Dto;
    }

    public void setNota1Dto(int nota1Dto) {
        this.nota1Dto = nota1Dto;
    }

    public int getNota2Dto() {
        return nota2Dto;
    }

    public void setNota2Dto(int nota2Dto) {
        this.nota2Dto = nota2Dto;
    }

    public int getNota3Dto() {
        return nota3Dto;
    }

    public void setNota3Dto(int nota3Dto) {
        this.nota3Dto = nota3Dto;
    }

    public int getNota4Dto() {
        return nota4Dto;
    }

    public void setNota4Dto(int nota4Dto) {
        this.nota4Dto = nota4Dto;
    }

    public int getControl1Dto() {
        return control1Dto;
    }

    public void setControl1Dto(int control1Dto) {
        this.control1Dto = control1Dto;
    }

    public int getControl2Dto() {
        return control2Dto;
    }

    public void setControl2Dto(int control2Dto) {
        this.control2Dto = control2Dto;
    }

    public int getControl3Dto() {
        return control3Dto;
    }

    public void setControl3Dto(int control3Dto) {
        this.control3Dto = control3Dto;
    }

    public int getControl4Dto() {
        return control4Dto;
    }

    public void setControl4Dto(int control4Dto) {
        this.control4Dto = control4Dto;
    }

    public int getPromedioNotasDto() {
        return promedioNotasDto;
    }

    public void setPromedioNotasDto(int promedioNotasDto) {
        this.promedioNotasDto = promedioNotasDto;
    }

    public int getPromedioControlesDto() {
        return promedioControlesDto;
    }

    public void setPromedioControlesDto(int promedioControlesDto) {
        this.promedioControlesDto = promedioControlesDto;
    }

    @Override
    public String toString() {
        return "ResponseNotaDto{" +
                "nota1Dto=" + nota1Dto +
                ", nota2Dto=" + nota2Dto +
                ", nota3Dto=" + nota3Dto +
                ", nota4Dto=" + nota4Dto +
                ", control1Dto=" + control1Dto +
                ", control2Dto=" + control2Dto +
                ", control3Dto=" + control3Dto +
                ", control4Dto=" + control4Dto +
                ", promedioNotasDto=" + promedioNotasDto +
                ", promedioControlesDto=" + promedioControlesDto +
                '}';
    }
}
