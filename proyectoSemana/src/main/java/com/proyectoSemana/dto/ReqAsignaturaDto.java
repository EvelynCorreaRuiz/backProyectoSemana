package com.proyectoSemana.dto;

import com.proyectoSemana.model.AsignaturasCurso;
import com.proyectoSemana.model.Nota;

import java.util.List;

public class ReqAsignaturaDto {

    private String nombre_AsignaturaDto;
    private Long id_asignaturaDto;
    private List<Nota> notaListDto;
    private List<AsignaturasCurso> asignaturaCursoListDto;


    public String getNombre_AsignaturaDto() {
        return nombre_AsignaturaDto;
    }

    public void setNombre_AsignaturaDto(String nombre_AsignaturaDto) {
        this.nombre_AsignaturaDto = nombre_AsignaturaDto;
    }

    public Long getId_asignaturaDto() {
        return id_asignaturaDto;
    }

    public void setId_asignaturaDto(Long id_asignaturaDto) {
        this.id_asignaturaDto = id_asignaturaDto;
    }

    public List<Nota> getNotaListDto() {
        return notaListDto;
    }

    public void setNotaListDto(List<Nota> notaListDto) {
        this.notaListDto = notaListDto;
    }

    public List<AsignaturasCurso> getAsignaturaCursoListDto() {
        return asignaturaCursoListDto;
    }

    public void setAsignaturaCursoListDto(List<AsignaturasCurso> asignaturaCursoListDto) {
        this.asignaturaCursoListDto = asignaturaCursoListDto;
    }
}
