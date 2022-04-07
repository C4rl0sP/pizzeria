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
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Comentario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String texto;
    private int puntuacion;
    private LocalDate fecha;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @NotNull(message = "El comentario tiene que tener un usuario")
    private Usuario usuarioId;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    // @NotNull(message = "El comentario tiene que tener una pizza")
    private Pizza pizza;

    public Comentario() {
        super();
    }

    public Comentario(long id, String texto, int puntuacion, LocalDate fecha, String pizza) {
        this.id = id;
        this.texto = texto;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
        this.pizza = pizza;
    }

}
