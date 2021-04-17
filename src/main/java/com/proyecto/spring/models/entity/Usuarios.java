package com.proyecto.spring.models.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Usuarios {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
	
private String nombre;
private String apellido;
private String direccion;
private String telefono;
@Column(unique=true)
private String nombreusuario;
@Column(unique=true)
private String correo;
private String contraseña;
private boolean estado;
@ManyToMany
private Set<Roles> roles;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getDireccion() {
	return direccion;
}
public void setDireccion(String direccion) {
	this.direccion = direccion;
}
public String getTelefono() {
	return telefono;
}
public void setTelefono(String telefono) {
	this.telefono = telefono;
}
public String getNombreusuario() {
	return nombreusuario;
}
public void setNombreusuario(String nombreusuario) {
	this.nombreusuario = nombreusuario;
}
public String getCorreo() {
	return correo;
}
public void setCorreo(String correo) {
	this.correo = correo;
}
public String getContraseña() {
	return contraseña;
}
public void setContraseña(String contraseña) {
	this.contraseña = contraseña;
}
public boolean isEstado() {
	return estado;
}
public void setEstado(boolean estado) {
	this.estado = estado;
}
public Set<Roles> getRoles() {
	return roles;
}
public void setRoles(Set<Roles> roles) {
	this.roles = roles;
}



}
