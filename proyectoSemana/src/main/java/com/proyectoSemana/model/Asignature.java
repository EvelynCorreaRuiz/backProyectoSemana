package com.proyectoSemana.model;

import javax.persistence.*;

@Entity
@Table(name = "asignature")
public class Asignature {
    @Id
    @Column(name = "id_asignature")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsignature;

    @Column(name = "NameAsignature", nullable = false, unique = true)
    private String courseName;

    public Asignature() {
    }

    public Long getIdAsignature() {
        return idAsignature;
    }

    public void setIdAsignature(Long idAsignature) {
        this.idAsignature = idAsignature;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Asignature{" +
                "idAsignature=" + idAsignature +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
