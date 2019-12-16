package com.proyectoSemana.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "asignaturas")
public class Asignatura {

    @Id
    @Column(name = "id_asignatura")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsignatura;

    @Column(name = "nombre_asignatura", nullable = false, unique = true)
    private String nombreAsignatura;

    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy ="asignatura")
    private List<Nota> notaList;

    @OneToMany(cascade = CascadeType.MERGE, fetch = FetchType.LAZY, mappedBy = "asignatura")
    private List<AsignaturaCurso> asignaturasCurso;

    public Long getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(Long idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public List<Nota> getNotaList() {
        return notaList;
    }

    public void setNotaList(List<Nota> notaList) {
        this.notaList = notaList;
    }

    public List<AsignaturaCurso> getAsignaturasCurso() {
        return asignaturasCurso;
    }

    public void setAsignaturasCurso(List<AsignaturaCurso> asignaturasCurso) {
        this.asignaturasCurso = asignaturasCurso;
    }
}
