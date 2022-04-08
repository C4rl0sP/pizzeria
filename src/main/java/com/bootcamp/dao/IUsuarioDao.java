package com.bootcamp.dao;

import com.bootcamp.entities.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioDao extends JpaRepository<Usuario, Long> {

}
