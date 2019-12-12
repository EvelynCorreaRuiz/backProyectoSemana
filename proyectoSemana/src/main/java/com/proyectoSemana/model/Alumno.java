package com.proyectoSemana.model;

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
    private Long id_curso;

    @OneToOne
    @JoinColumn(name = "idlogin")
    private Long id_login;

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

    public Long getId_curso() {
        return id_curso;
    }

    public void setId_curso(Long id_curso) {
        this.id_curso = id_curso;
    }

    public Long getId_login() {
        return id_login;
    }

    public void setId_login(Long id_login) {
        this.id_login = id_login;
    }
}
