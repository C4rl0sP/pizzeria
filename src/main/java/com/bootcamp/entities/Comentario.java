package com.bootcamp.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Comentario implements Serializable {

    private static final long serialVersionUID = 4L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "El comentario tiene que tener un texto")
    private String texto;

    @NotNull(message = "El comentario tiene que tener un texto")
    private int puntuacion;

    @NotNull(message = "El comentario tiene que tener un texto")
    private LocalDate fecha;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @NotNull(message = "El comentario tiene que tener un usuario")
    private Usuario usuario;

    @ManyToOne
    private Pizza pizza;

    public Comentario() {
        super();
    }

    public Comentario(long id, @NotNull(message = "El comentario tiene que tener un texto") String texto,
            @NotNull(message = "El comentario tiene que tener un texto") int puntuacion,
            @NotNull(message = "El comentario tiene que tener un texto") LocalDate fecha,
            @NotNull(message = "El comentario tiene que tener un usuario") Usuario usuario, Pizza pizza) {
        this.id = id;
        this.texto = texto;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
        this.usuario = usuario;
        this.pizza = pizza;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pizza getPizza() {
        return pizza;
    }

    public void setPizza(Pizza pizza) {
        this.pizza = pizza;
    }

}
