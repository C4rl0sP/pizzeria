package com.bootcamp.dao;

import com.bootcamp.entities.Ingrediente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IIngredienteDao extends JpaRepository<Ingrediente, Long> {

}
