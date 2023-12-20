package com.distribuida.entities;

public class Factura {
	
	//Atributos
	private int id_factura; 
	private int fecha;         
	private float total_neto; 
	private float iva; 
	private float total;
	
	private Cliente cliente;  //CLIENTE
	

	public Factura() {}
	
	public Factura(Cliente cliente) {
		this.cliente=cliente;
	}
	
	//Metodo Set and Get
	public int getId_factura() {
		return id_factura;
	}
	public void setId_factura(int id_factura) {
		this.id_factura = id_factura;
	}
	public int getFecha() {
		return fecha;
	}
	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
	public float getTotal_neto() {
		return total_neto;
	}
	public void setTotal_neto(float total_neto) {
		this.total_neto = total_neto;
	}
	public float getIva() {
		return iva;
	}
	public void setIva(float iva) {
		this.iva = iva;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	
	
	
	//Metodo set y get para la inyeccion de CLIENTE
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	@Override
	public String toString() {
		return "Factura [id_factura=" + id_factura + ", fecha=" + fecha + ", total_neto=" + total_neto + ", iva=" + iva
				+ ", total=" + total + ", cliente=" + cliente + "]";
	} 
	
	

}
