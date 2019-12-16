package com.proyectoSemana.model;

import javax.persistence.*;

@Entity
@Table(name = "profesor")
public class Profesor {

    @Id
    @Column(name = "id_profesor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProfesor;

    @Column(name = "nombre_profesor", nullable = false)
    private String nombreProfesor;

    @Column(name = "apellido_profesor", nullable = false)
    private String apellidoProfesor;

    @Column(name = "rut_profesor", nullable = false, unique = true)
    private String rutProfesor;

    @OneToOne
    @JoinColumn(name = "id_login", updatable = false, nullable = false)
    private Login login;

    @ManyToOne(optional = false, cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    private Curso curso;

    public Long getIdProfesor() {
        return idProfesor;
    }

    public void setIdProfesor(Long idProfesor) {
        this.idProfesor = idProfesor;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getApellidoProfesor() {
        return apellidoProfesor;
    }

    public void setApellidoProfesor(String apellidoProfesor) {
        this.apellidoProfesor = apellidoProfesor;
    }

    public String getRutProfesor() {
        return rutProfesor;
    }

    public void setRutProfesor(String rutProfesor) {
        this.rutProfesor = rutProfesor;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
