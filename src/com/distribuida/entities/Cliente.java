package com.distribuida.entities;

import java.util.Date;

public class Cliente {

	private int idCliente;
	private String cedula;
	private String nombre;
	private String apellido;
	private int edad;
	private Date fechaNacimiento;
	private String direccion;
	private String telefono;
	private String correo;
	
	
	
	public Cliente( ) { }



	public int getIdCliente() {
		return idCliente;
	}



	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}



	public String getCedula() {
		return cedula;
	}



	public void setCedula(String cedula) {
		this.cedula = cedula;
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



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}



	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
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



	public String getCorreo() {
		return correo;
	}



	public void setCorreo(String correo) {
		this.correo = correo;
	}



	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido="
				+ apellido + ", edad=" + edad + ", fechaNacimiento=" + fechaNacimiento + ", direccion=" + direccion
				+ ", telefono=" + telefono + ", correo=" + correo + "]";
	}
	
	
	
	
}
