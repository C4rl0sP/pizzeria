package com.bootcamp.dao;

import com.bootcamp.entities.Pizza;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IPizzaDao extends JpaRepository<Pizza, Long> {

}
