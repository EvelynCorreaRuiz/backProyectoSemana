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

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "asignatura")
    private List<Nota> notaList;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "asignatura")
    private List<AsignaturasCurso> asignaturasCurso;

    public List<Nota> getNotaList() {
        return notaList;
    }

    public void setNotaList(List<Nota> notaList) {
        this.notaList = notaList;
    }

    public List<AsignaturasCurso> getAsignaturasCurso() {
        return asignaturasCurso;
    }

    public void setAsignaturasCurso(List<AsignaturasCurso> asignaturasCurso) {
        this.asignaturasCurso = asignaturasCurso;
    }

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

    public void setAsignaturasCurso() { }
}
