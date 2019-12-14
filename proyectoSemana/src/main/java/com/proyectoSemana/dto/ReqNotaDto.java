package com.proyectoSemana.dto;

import com.proyectoSemana.model.Alumno;
import com.proyectoSemana.model.Asignatura;

public class ReqNotaDto {

    private Long id_notasDto;
    private Alumno alumnoDto;
    private Asignatura asignaturaDto;
    private double nota1Dto;
    private double nota2Dto;
    private double nota3Dto;
    private double nota4Dto;
    private double control1Dto;
    private double control2Dto;
    private double control3Dto;
    private double control4Dto;
    private double promedioNota;
    private double promedioControles;

    public Long getId_notasDto() {
        return id_notasDto;
    }

    public void setId_notasDto(Long id_notasDto) {
        this.id_notasDto = id_notasDto;
    }

    public Alumno getAlumnoDto() {
        return alumnoDto;
    }

    public void setAlumnoDto(Alumno alumnoDto) {
        this.alumnoDto = alumnoDto;
    }

    public Asignatura getAsignaturaDto() {
        return asignaturaDto;
    }

    public void setAsignaturaDto(Asignatura asignaturaDto) {
        this.asignaturaDto = asignaturaDto;
    }

    public double getNota1Dto() {
        return nota1Dto;
    }

    public void setNota1Dto(double nota1Dto) {
        this.nota1Dto = nota1Dto;
    }

    public double getNota2Dto() {
        return nota2Dto;
    }

    public void setNota2Dto(double nota2Dto) {
        this.nota2Dto = nota2Dto;
    }

    public double getNota3Dto() {
        return nota3Dto;
    }

    public void setNota3Dto(double nota3Dto) {
        this.nota3Dto = nota3Dto;
    }

    public double getNota4Dto() {
        return nota4Dto;
    }

    public void setNota4Dto(double nota4Dto) {
        this.nota4Dto = nota4Dto;
    }

    public double getControl1Dto() {
        return control1Dto;
    }

    public void setControl1Dto(double control1Dto) {
        this.control1Dto = control1Dto;
    }

    public double getControl2Dto() {
        return control2Dto;
    }

    public void setControl2Dto(double control2Dto) {
        this.control2Dto = control2Dto;
    }

    public double getControl3Dto() {
        return control3Dto;
    }

    public void setControl3Dto(double control3Dto) {
        this.control3Dto = control3Dto;
    }

    public double getControl4Dto() {
        return control4Dto;
    }

    public void setControl4Dto(double control4Dto) {
        this.control4Dto = control4Dto;
    }

    public double getPromedioNota() {
        return promedioNota;
    }

    public void setPromedioNota(double promedioNota) {
        this.promedioNota = promedioNota;
    }

    public double getPromedioControles() {
        return promedioControles;
    }

    public void setPromedioControles(double promedioControles) {
        this.promedioControles = promedioControles;
    }
}
