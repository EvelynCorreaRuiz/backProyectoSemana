package com.proyectoSemana.repository;

import com.proyectoSemana.dto.ReqLoginDto;
import com.proyectoSemana.dto.ReqProfesorDto;
import com.proyectoSemana.model.Login;
import com.proyectoSemana.model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long>{

    Profesor findByRut(String rut);

    Login findByEmail(String email);

}
