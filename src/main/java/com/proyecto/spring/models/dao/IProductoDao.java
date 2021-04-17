package com.proyecto.spring.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.spring.models.entity.Producto;

public interface IProductoDao extends JpaRepository<Producto, Long>{

}
