package com.bootcamp.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Pizza implements Serializable {

    private static final long serialVersionUID = 4L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String foto;

    @ManyToMany(cascade = CascadeType.PERSIST, mappedBy = "ingrediente")
    @NotNull(message = "La pizza debe tener tener ingredientes")
    private List<Ingrediente> ingredientes;

    @NotNull(message = "La pizza tiene que tener un comentario")
    @ManyToOne(cascade = CascadeType.PERSIST)
    private List<Comentario> comentarios;

    @NotNull(message = "La pizza debe tener un precio")
    private double precio;

    public Pizza() {
        super();
    }

    public Pizza(long id, String foto,
            @NotNull(message = "La pizza debe tener tener ingredientes") List<Ingrediente> ingredientes,
            @NotNull(message = "La pizza tiene que tener un comentario") List<Comentario> comentarios,
            @NotNull(message = "La pizza debe tener un precio") double precio) {
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

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
