package com.proyectoSemana.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Nota {
    @Id
    @Column(name = "id_nota")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNota;

    @Column(name = "Notas", nullable = false)
    private String notaNombre;

    @Column(name = "nota_1", nullable = false)
    private int nota1;

    @Column(name = "nota_2", nullable = false)
    private int nota2;

    @Column(name = "nota_3", nullable = false)
    private int nota3;

    @Column(name = "nota_4", nullable = false)
    private int nota4;

    @Column(name = "control_1", nullable = false)
    private int control1;

    @Column(name = "control_2", nullable = false)
    private int control2;

    @Column(name = "control_3", nullable = false)
    private int control3;

    @Column(name = "control_4", nullable = false)
    private int control4;





    public Long getIdNota() {
        return idNota;
    }

    public void setIdNota(Long idNota) {
        this.idNota = idNota;
    }

    public String getNotaNombre() {
        return notaNombre;
    }

    public void setNotaNombre(String notaNombre) {
        this.notaNombre = notaNombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }

    public int getNota4() {
        return nota4;
    }

    public void setNota4(int nota4) {
        this.nota4 = nota4;
    }

    public int getControl1() {
        return control1;
    }

    public void setControl1(int control1) {
        this.control1 = control1;
    }

    public int getControl2() {
        return control2;
    }

    public void setControl2(int control2) {
        this.control2 = control2;
    }

    public int getControl3() {
        return control3;
    }

    public void setControl3(int control3) {
        this.control3 = control3;
    }

    public int getControl4() {
        return control4;
    }

    public void setControl4(int control4) {
        this.control4 = control4;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "idNota=" + idNota +
                ", notaNombre='" + notaNombre + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", nota4=" + nota4 +
                ", control1=" + control1 +
                ", control2=" + control2 +
                ", control3=" + control3 +
                ", control4=" + control4 +
                '}';
    }
}

