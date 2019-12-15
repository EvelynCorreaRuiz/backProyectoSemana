package com.proyectoSemana.repository;

import com.proyectoSemana.model.Nota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface NotaRepository extends JpaRepository<Nota, Long> {
    Optional<Nota> findByIdAlumno(Long id);
    Optional<Nota> findByIdAsignatura(Long Id);
}
