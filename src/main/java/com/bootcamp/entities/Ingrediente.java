package com.bootcamp.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Ingrediente implements Serializable {

    private static final long serialVersionUID = 4L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull(message = "El ingrediente tiene que tener una pizza")

    private String nombre;

    @NotNull(message = "El ingrediente tiene que tener un precio")
    private double precio;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private List<Pizza> pizzas;

    public Ingrediente() {
        super();
    }

    public Ingrediente(long id, @NotNull(message = "El ingrediente tiene que tener una pizza") String nombre,
            @NotNull(message = "El ingrediente tiene que tener un precio") double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

}
