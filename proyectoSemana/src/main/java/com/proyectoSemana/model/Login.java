package com.proyectoSemana.model;

import javax.persistence.*;
import javax.validation.constraints.Email;

@Entity
@Table(name = "login")
public class Login {

    @Id
    @Column(name = "id_login")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLogin;

    @Column(name = "email", unique = true, nullable = false)
    @Email
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @OneToOne(mappedBy = "login", cascade = CascadeType.MERGE)
    private Alumno alumno;

    @OneToOne(mappedBy = "login", cascade = CascadeType.MERGE)
    private Profesor profesor;


    public Long getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(Long idLogin) {
        this.idLogin = idLogin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
