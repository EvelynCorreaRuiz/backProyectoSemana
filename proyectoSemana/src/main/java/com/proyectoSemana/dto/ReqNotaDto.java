package com.proyectoSemana.dto;

import com.proyectoSemana.model.Alumno;
import com.proyectoSemana.model.Asignatura;

public class ReqNotaDto {
    private Long id_notasDto;
    private Alumno alumnoDto;
    private Asignatura asignaturaDto;
    private int nota1Dto;
    private int nota2Dto;
    private int nota3Dto;
    private int nota4Dto;
    private int control1Dto;
    private int control2Dto;
    private int control3Dto;
    private int control4Dto;

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
}
