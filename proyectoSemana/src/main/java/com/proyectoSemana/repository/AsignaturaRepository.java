package com.proyectoSemana.repository;

import com.proyectoSemana.model.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {
    Asignatura findByNombreAsignatura(String nombre);
}
