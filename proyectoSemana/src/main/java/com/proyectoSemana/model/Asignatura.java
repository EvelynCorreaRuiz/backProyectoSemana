package com.proyectoSemana.model;

import javax.persistence.*;

@Entity
@Table(name = "asignatura")
public class Asignatura {
    @Id
    @Column(name = "idasignatura")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsignatura;

    @Column(name = "nombre_asignatura", nullable = false, unique = true)
    private String cursoName;
    
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

}
