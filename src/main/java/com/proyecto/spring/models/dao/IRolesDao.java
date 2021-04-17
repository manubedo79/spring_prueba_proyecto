package com.proyecto.spring.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.spring.models.entity.Roles;

public interface IRolesDao extends JpaRepository<Roles, Long>{
public Roles findByTipo(String tipo);

}
