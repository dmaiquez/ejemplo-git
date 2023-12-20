package com.distribuida.entities;

public class Categoria {

//Atributos
	private int idCategoria;
	private String categoria;
	private String descripcion;
	
//Constructor
	public Categoria() {}
	
//Metodos Getter and Setter
	public int getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", categoria=" + categoria + ", descripcion=" + descripcion
				+ "]";
	}	
}
