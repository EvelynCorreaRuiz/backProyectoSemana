package com.proyectoSemana.model;

import javax.persistence.*;

public class Nota {
    @Id
    @Column(name = "idnota")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNota;

    @ManyToOne
    @JoinColumn(name = "alumnos_idalumnos")
    private Long idalumnos;

<<<<<<< HEAD
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




=======
    @ManyToOne
    @JoinColumn(name = "asignaturas_idasignaturas")
    private Long idasignaturas;

    @ManyToOne
    @JoinColumn(name = "alumnos_login_idlogin")
    private Long idLoginAlumno;

    @Column(name = "notas_1")
    private double nota1;

    @Column(name = "notas_2")
    private double nota2;

    @Column(name = "notas_3")
    private double nota3;

    @Column(name = "notas_4")
    private double nota4;

    @Column(name = "control_1")
    private double control1;

    @Column(name = "control_2")
    private double control2;

    @Column(name = "control_3")
    private double control3;

    @Column(name = "control_4")
    private double control4;
>>>>>>> 5b571ad96143c1961c88675fd3e12a8883d48a84

    public Long getIdNota() {
        return idNota;
    }

    public void setIdNota(Long idNota) {
        this.idNota = idNota;
    }

    public Long getIdalumnos() {
        return idalumnos;
    }

    public void setIdalumnos(Long idalumnos) {
        this.idalumnos = idalumnos;
    }

    public Long getIdasignaturas() {
        return idasignaturas;
    }

    public void setIdasignaturas(Long idasignaturas) {
        this.idasignaturas = idasignaturas;
    }

    public Long getIdLoginAlumno() {
        return idLoginAlumno;
    }

    public void setIdLoginAlumno(Long idLoginAlumno) {
        this.idLoginAlumno = idLoginAlumno;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getControl1() {
        return control1;
    }

    public void setControl1(double control1) {
        this.control1 = control1;
    }

    public double getControl2() {
        return control2;
    }

    public void setControl2(double control2) {
        this.control2 = control2;
    }

    public double getControl3() {
        return control3;
    }

    public void setControl3(double control3) {
        this.control3 = control3;
    }

    public double getControl4() {
        return control4;
    }

<<<<<<< HEAD
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
=======
    public void setControl4(double control4) {
        this.control4 = control4;
>>>>>>> 5b571ad96143c1961c88675fd3e12a8883d48a84
    }
}
