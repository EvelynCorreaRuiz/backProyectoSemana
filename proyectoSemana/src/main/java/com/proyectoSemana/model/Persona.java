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
    @Column(name = "rut_persona", nullable = false,unique = true)
    private String rutPersona;
    @Column(name = "fecha_creacion", nullable = false)
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date fechaCreacion;
    @Column(name = "fecha_actualizacion")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date fechaActualizacion;
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

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualizacion() {
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
