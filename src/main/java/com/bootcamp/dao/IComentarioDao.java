package com.bootcamp.dao;

import com.bootcamp.entities.Comentario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IComentarioDao extends JpaRepository<Comentario, Long> {

}
