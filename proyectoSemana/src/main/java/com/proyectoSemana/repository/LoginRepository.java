package com.proyectoSemana.repository;

import com.proyectoSemana.model.Login;
import org.springframework.data.repository.CrudRepository;

public interface LoginRepository extends CrudRepository<Login, Long> {
    Login findByEmailAndPassword(String email, String password);
}
