package com.proyectoSemana.model;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;

public class Nota {
    @Id
    @Column(name = "idnota")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNota;

    @ManyToOne
    @JoinColumn(name = "alumnos_idalumnos")
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "asignaturas_idasignaturas")
    private Asignatura asignatura;

    @ManyToOne
    @JoinColumn(name = "alumnos_login_idlogin")
    private Login login;

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

    @Column(name = "promedioNotas")
    private double promedioNotas;

    @Column(name = "promedioControles")
    private double promedioControles;

    public Long getIdNota() {
        return idNota;
    }

    public void setIdNota(Long idNota) {
        this.idNota = idNota;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
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

    public void setControl4(double control4) {
        this.control4 = control4;
    }

    public double getPromedioNotas() {
        return promedioNotas;
    }

    public void setPromedioNotas(double promedioNotas) {
        this.promedioNotas = promedioNotas;
    }

    public double getPromedioControles() {
        return promedioControles;
    }

    public void setPromedioControles(double promedioControles) {
        this.promedioControles = promedioControles;
    }
}

