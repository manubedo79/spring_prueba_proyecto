package com.proyecto.spring.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.spring.models.entity.Usuarios;

public interface IUsuariosDao extends JpaRepository<Usuarios, Long>{

}
