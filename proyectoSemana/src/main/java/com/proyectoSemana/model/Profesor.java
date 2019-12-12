package com.proyectoSemana.model;

import javax.persistence.*;

@Entity
@Table(name = "profesor")
public class Profesor {

    @Id
    @Column(name = "idrofesor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_profesor;

    @Column(name = "nombre_profesor")
    private String nombreProfesor;

    @Column(name = "apellido_profesor")
    private String apellidoProfesor;

    @OneToOne
    @JoinColumn(name = "idlogin")
    private Long getId_profesor;

    @ManyToOne
    @JoinColumn(name = "idcurso")
    private Long getId_curso;

    @Column(name = "rut_profesor")
    private String rutProfesor;

    public Long getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(Long id_profesor) {
        this.id_profesor = id_profesor;
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

    public Long getGetId_profesor() {
        return getId_profesor;
    }

    public void setGetId_profesor(Long getId_profesor) {
        this.getId_profesor = getId_profesor;
    }

    public Long getGetId_curso() {
        return getId_curso;
    }

    public void setGetId_curso(Long getId_curso) {
        this.getId_curso = getId_curso;
    }

    public String getRutProfesor() {
        return rutProfesor;
    }

    public void setRutProfesor(String rutProfesor) {
        this.rutProfesor = rutProfesor;
    }
}
