package com.proyectoSemana.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Nota {
    @Id
    @Column(name = "id_nota")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNota;

    @Column(name = "Notas", nullable = false)
    private String notaNombre;

    public Nota() {
    }

    public Long getIdNota() {
        return idNota;
    }

    public void setIdNota(Long idNota) {
        this.idNota = idNota;
    }

    public String getNotaNombre() {
        return notaNombre;
    }

    public void setNotaNombre(String notaNombre) {
        this.notaNombre = notaNombre;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "idNota=" + idNota +
                ", notaNombre='" + notaNombre + '\'' +
                '}';
    }
}
