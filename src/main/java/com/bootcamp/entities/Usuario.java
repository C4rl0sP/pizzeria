package com.bootcamp.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 4L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "La pizza debe tener tener ingredientes")
    private String nombre;

    @NotNull(message = "La pizza debe tener tener ingredientes")
    private String apellido1;

    private String apellido2;

    @NotNull(message = "La pizza debe tener tener ingredientes")
    private String email;

    @NotNull(message = "La pizza debe tener tener ingredientes")
    private String contraseña;

    public Usuario() {
    }

    public Usuario(long id, String nombre, String apellido1, String apellido2, String email, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido1 = apellido2;
        this.email = email;
        this.contraseña = contraseña;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

}
