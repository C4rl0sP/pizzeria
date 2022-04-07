package com.bootcamp.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Pizza implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String foto;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @NotNull(message = "La pizza debe tener tener ingredientes")
    private String ingredientes;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    // @NotNull(message = "El producto tiene que tener una presentación")
    private String comentarios;

    // @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @NotNull(message = "La pizza debe tener un precio")
    private double precio;

    public Pizza() {
        super();
    }

    public Pizza(long id, String foto, String ingredientes, String comentarios, double precio) {
        this.id = id;
        this.foto = foto;
        this.ingredientes = ingredientes;
        this.comentarios = comentarios;
        this.precio = precio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentario) {
        this.comentarios = comentario;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
