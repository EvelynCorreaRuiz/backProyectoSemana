package com.proyectoSemana.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "alumnos")
public class Alumno {

    @Id
    @Column(name = "id_alumno")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlumno;

    @Column(name = "nombre_alumno", nullable = false)
    private String nombreAlumno;

    @Column(name = "apellido_alumno", nullable = false)
    private String apellidoAlumno;

    @Column(name = "rut_alumno", nullable = false, unique = true)
    private String rutAlumno;

    @ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private Curso curso ;

    @OneToOne
    @JoinColumn(name = "id_login", updatable = false, nullable = false)
    private Login login;

    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "alumno")
    private List<Nota> notaList;

    public Long getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(Long idAlumno) {
        this.idAlumno = idAlumno;
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

    public String getRutAlumno() {
        return rutAlumno;
    }

    public void setRutAlumno(String rutAlumno) {
        this.rutAlumno = rutAlumno;
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
