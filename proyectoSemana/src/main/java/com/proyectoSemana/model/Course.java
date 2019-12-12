package com.proyectoSemana.model;

import javax.persistence.*;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @Column(name = "id_coruse")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCoruse;

    @Column(name = "NameCorse", nullable = false, unique = true)
    private String courseName;

    public Long getIdCoruse() {
        return idCoruse;
    }

    public void setIdCoruse(Long idCoruse) {
        this.idCoruse = idCoruse;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Course() {
    }

    @Override
    public String toString() {
        return "Course{" +
                "idCoruse=" + idCoruse +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
