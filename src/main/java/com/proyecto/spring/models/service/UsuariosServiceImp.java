package com.proyecto.spring.models.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.proyecto.spring.models.dao.IRolesDao;
import com.proyecto.spring.models.dao.IUsuariosDao;
import com.proyecto.spring.models.entity.Roles;
import com.proyecto.spring.models.entity.Usuarios;
@Service
public class UsuariosServiceImp implements IUsuariosService{

	@Autowired
	private IUsuariosDao iusudao;
	@Autowired
	private IRolesDao irolesdao;
	@Override
	public void guardarUsuarioCliente(Usuarios usuarios) {
		Roles roles = irolesdao.findByTipo("CLIENTE"); //1
		Set<Roles> listaroles = new HashSet<>(Arrays.asList(roles));
		usuarios.setRoles(listaroles);
		iusudao.save(usuarios);
		
	}

}
