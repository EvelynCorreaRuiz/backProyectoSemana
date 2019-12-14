package com.proyectoSemana.model;

import org.springframework.cache.interceptor.CacheAspectSupport;

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
    private String cursoName;

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

    public String getCursoName() {
        return cursoName;
    }

    public void setCursoName(String cursoName) {
        this.cursoName = cursoName;
    }

}
