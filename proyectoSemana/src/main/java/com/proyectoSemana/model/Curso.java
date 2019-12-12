package com.proyectoSemana.model;

import javax.persistence.*;

@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @Column(name = "id_curso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;

    @Column(name = "nombre_curso", nullable = false, unique = true)
    private String nombreCurso;

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

}
