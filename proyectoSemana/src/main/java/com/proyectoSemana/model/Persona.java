package com.proyectoSemana.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Persona")
public class Persona {

    @Id
    @Column(name = "id_persona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    @OneToOne
    @JoinColumn(name = "id_login", updatable = false, nullable = false)
    private Login login;
    @OneToOne
    @JoinColumn(name = "id_rol", updatable = false, nullable = false)
    private Rol rol;
    @Column(name = "nombre_persona", nullable = false)
    private String nombrePersona;
    @Column(name = "apellido_persona", nullable = false)
    private String apellidoPersona;
    @Column(name = "rut_persona", nullable = false, unique = true)
    private String rutPersona;


    public Long getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Long idPersona) {
        this.idPersona = idPersona;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getApellidoPersona() {
        return apellidoPersona;
    }

    public void setApellidoPersona(String apellidoPersona) {
        this.apellidoPersona = apellidoPersona;
    }

    public String getRutPersona() {
        return rutPersona;
    }

    public void setRutPersona(String rutPersona) {
        this.rutPersona = rutPersona;
    }
}
