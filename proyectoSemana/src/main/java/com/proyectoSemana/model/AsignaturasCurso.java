package com.proyectoSemana.model;

import javax.persistence.*;

@Entity
@Table(name = "asignaturas_has_curso") // esta se relaciona a 2 tablas a curso y asignatura
public class AsignaturasCurso {

    @Id
    @Column(name = "id_has_curso")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Asignatura asignatura;

    @ManyToOne(optional = false, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Curso curso;

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}


