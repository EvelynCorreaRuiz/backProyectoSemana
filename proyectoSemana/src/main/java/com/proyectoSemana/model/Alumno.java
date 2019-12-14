package com.proyectoSemana.model;

import org.aspectj.weaver.ast.Not;
import sun.rmi.runtime.Log;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "alumnos")
public class Alumno {

    @Id
    @Column(name = "id_alumno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_alumno;

    @Column(name = "nombre_alumno", nullable = false)
    private String nombreAlumno;

    @Column(name = "apellido_alumno", nullable = false)
    private String apellidoAlumno;

    @Column(name = "rut_alumno", nullable = false, unique = true)
    private String rut;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Curso curso ;

    @OneToOne
    @JoinColumn(name = "id_login", updatable = false, nullable = false)
    private Login login;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alumno")
    private List<Nota> notaList;

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

    public List<Nota> getNotaList() {
        return notaList;
    }

    public void setNotaList(List<Nota> notaList) {
        this.notaList = notaList;
    }
}
