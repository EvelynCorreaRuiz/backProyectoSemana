package com.proyectoSemana.dto;

public class ReqCursoDto {
    private Long id_cursoDto;
    private Long id_profesor;
    private String nombreCursoDto;
    private String nombre_profesorDto;

    public Long getId_cursoDto() {
        return id_cursoDto;
    }

    public void setId_cursoDto(Long id_cursoDto) {
        this.id_cursoDto = id_cursoDto;
    }

    public Long getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(Long id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getNombreCursoDto() {
        return nombreCursoDto;
    }

    public void setNombreCursoDto(String nombreCursoDto) {
        this.nombreCursoDto = nombreCursoDto;
    }

    public String getNombre_profesorDto() {
        return nombre_profesorDto;
    }

    public void setNombre_profesorDto(String nombre_profesorDto) {
        this.nombre_profesorDto = nombre_profesorDto;
    }
}

