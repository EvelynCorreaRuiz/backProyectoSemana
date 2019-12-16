package com.proyectoSemana.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "curso")
public class Curso {

    @Id
    @Column(name = "id_curso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;

    @Column(name = "nombre_curso", nullable = false, unique = true)
    private String nombreCurso;

    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "curso")
    private List<Profesor> profesorList;

    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "curso")
    private List<Alumno> alumnoList;

    @OneToMany(cascade = CascadeType.MERGE, mappedBy = "curso")
    private List<AsignaturaCurso> asignaturaCursoList;

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public List<Profesor> getProfesorList() {
        return profesorList;
    }

    public void setProfesorList(List<Profesor> profesorList) {
        this.profesorList = profesorList;
    }

    public List<Alumno> getAlumnoList() {
        return alumnoList;
    }

    public void setAlumnoList(List<Alumno> alumnoList) {
        this.alumnoList = alumnoList;
    }

    public List<AsignaturaCurso> getAsignaturaCursoList() {
        return asignaturaCursoList;
    }

    public void setAsignaturaCursoList(List<AsignaturaCurso> asignaturaCursoList) {
        this.asignaturaCursoList = asignaturaCursoList;
    }
}
