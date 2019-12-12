package com.proyectoSemana.model;

import javax.persistence.*;

@Entity
@Table(name = "asignatura")
public class Asignatura {
    @Id
    @Column(name = "id_asignatura")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsignatura;

    @Column(name = "NameAsignatura", nullable = false, unique = true)
    private String cursoName;

    public Asignatura() {
    }

    public Long getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Long idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getCursoName() {
        return cursoName;
    }

    public void setCursoName(String cursoName) {
        this.cursoName = cursoName;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "idAsignatura=" + idAsignatura +
                ", cursoName='" + cursoName + '\'' +
                '}';
    }
}
