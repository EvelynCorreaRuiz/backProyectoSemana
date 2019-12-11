package com.proyectoSemana.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Person")
public class Person {

    @Id
    @Column(name = "id_persona")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPersona;
    @OneToOne // indica relacion uno a uno y el joinColumn el nombbre exacto de la columna
    @JoinColumn(name = "id_login", updatable = false, nullable = false)
    private Login login;
    @OneToOne
    @JoinColumn(name = "id_rol", updatable = false, nullable = false)
    private Rol rol;
    @Column(name = "nombre_persona", nullable = false)
    private String nombrePersona;
    @Column(name = "apellido_persona", nullable = false)
    private String apellidoPersona;
    @Column(name = "rut_persona", nullable = false,unique = true)
    private String rutPersona;
    @Column(name = "fecha_creacion", nullable = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private java.util.Date fechaCreacion;
    @Column(name = "fecha_actualizacion")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private java.util.Date fechaActualizacion;
    @Column(name = "active", nullable = false)
    private byte active;

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

    public java.util.Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(java.util.Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public java.util.Date getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(Date fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    public byte getActive() {
        return active;
    }

    public void setActive(byte active) {
        this.active = active;
    }
}
