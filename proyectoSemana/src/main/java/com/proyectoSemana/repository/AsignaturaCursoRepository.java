package com.proyectoSemana.repository;

import com.proyectoSemana.model.AsignaturasCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaCursoRepository extends JpaRepository<AsignaturasCurso, Long> {
}
