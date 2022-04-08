package com.bootcamp.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Usuario implements Serializable {

    private static final long serialVersionUID = 4L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "El usuario debe tener tener ingredientes")
    @NotEmpty
    @Size(min = 4, max = 255, message = "El campo nombre tiene que tener entre 4 y 255 caracteres")
    private String nombre;

    @NotNull(message = "La pizza debe tener tener ingredientes")
    @Size(min = 2, max = 255, message = "El campo nombre tiene que tener entre 4 y 255 caracteres")
    private String apellido1;

    @Size(min = 2, max = 255, message = "El campo nombre tiene que tener entre 4 y 255 caracteres")
    private String apellido2;

    @NotNull(message = "La pizza debe tener tener ingredientes")
    @Size(min = 2, max = 255, message = "El campo nombre tiene que tener entre 4 y 255 caracteres")
    private String email;

    @NotNull(message = "La pizza debe tener tener ingredientes")
    @Size(min = 2, max = 255, message = "El campo nombre tiene que tener entre 4 y 255 caracteres")
    private String password;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, mappedBy = "usuario")
    private List<Comentario> comentarios;

    public Usuario() {
    }

    public Usuario(long id, @NotNull(message = "La pizza debe tener tener ingredientes") String nombre,
            @NotNull(message = "La pizza debe tener tener ingredientes") String apellido1, String apellido2,
            @NotNull(message = "La pizza debe tener tener ingredientes") String email,
            @NotNull(message = "La pizza debe tener tener ingredientes") String password,
            List<Comentario> comentarios) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.password = password;
        this.comentarios = comentarios;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

}
