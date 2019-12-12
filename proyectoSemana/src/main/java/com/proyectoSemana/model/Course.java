package com.proyectoSemana.model;

import javax.persistence.*;

@Entity
@Table(name = "curso")
public class Curso {
    @Id
    @Column(name = "id_curso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCurso;

    @Column(name = "NameCurso", nullable = false, unique = true)
    private String cursoName;

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public String getCursoName() {
        return cursoName;
    }

    public void setCursoName(String cursoName) {
        this.cursoName = cursoName;
    }

    public Curso() {
    }

    @Override
    public String toString() {
        return "Curso{" +
                "idCurso=" + idCurso +
                ", cursoName='" + cursoName + '\'' +
                '}';
    }
}
