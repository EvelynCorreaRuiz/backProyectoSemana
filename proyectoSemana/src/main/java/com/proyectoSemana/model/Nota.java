package com.proyectoSemana.model;

import javax.persistence.*;

public class Nota {
    @Id
    @Column(name = "idnota")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Nota nota;

    @ManyToOne
    @JoinColumn(name = "alumnos_idalumnos")
    private Alumno alumno;

    @ManyToOne
    @JoinColumn(name = "asignaturas_idasignaturas")
    private Asignatura asignatura;

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

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
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
}

