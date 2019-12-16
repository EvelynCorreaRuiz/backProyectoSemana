package com.proyectoSemana.repository;

import com.proyectoSemana.dto.ReqAlumnoDto;
import com.proyectoSemana.model.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {

    Alumno findByRut(String rut);

}
