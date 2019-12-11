package com.proyectoSemana.model;

import javax.persistence.*;

@Entity
@Table(name = "Grades")
public class Grades {

    @Id
    @Column(name = "id_grades")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGrades;

    @Column(name = "grades")
    private int grades;

    public Long getIdGrades() {
        return idGrades;
    }

    public void setIdGrades(Long idGrades) {
        this.idGrades = idGrades;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }
}
