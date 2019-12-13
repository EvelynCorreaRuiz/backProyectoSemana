package com.proyectoSemana.model;

import sun.rmi.runtime.Log;

import javax.persistence.*;

@Entity
@Table(name = "alumno")
public class Alumno {

    @Id
    @Column(name = "idalumno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_alumno;

    @Column(name = "nombre_alumno", nullable = false)
    private String nombreAlumno;

    @Column(name = "apellido_alumno", nullable = false)
    private String apellidoAlumno;

    @Column(name = "rut_alumno", nullable = false, unique = true)
    private String rut;

    @ManyToOne
    @JoinColumn(name = "idcurso")
    private Curso curso ;

    @OneToOne
    @JoinColumn(name = "idlogin" )
    private Login login;

    public Long getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(Long id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}
