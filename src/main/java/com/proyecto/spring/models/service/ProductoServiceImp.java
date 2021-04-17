package com.proyecto.spring.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.spring.models.dao.IProductoDao;
import com.proyecto.spring.models.entity.Producto;
@Service
public class ProductoServiceImp implements IProductoService{
	@Autowired
	private IProductoDao produdao;
	@Override
	public List<Producto> listarProductos() {
		return produdao.findAll();
	}

}
