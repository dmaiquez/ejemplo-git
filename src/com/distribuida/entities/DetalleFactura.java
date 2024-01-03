package com.distribuida.entities;

public class DetalleFactura {
	
	private int idDetFac;
	private String cantidad;
	private double subtotal;

	
	public DetalleFactura() {}

	public int getIdDetFac() {
		return idDetFac;
	}

	public void setIdDetFac(int idDetFac) {
		this.idDetFac = idDetFac;
		
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	public double getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(double subtotal) {
		this.subtotal = subtotal;
	}


	






	
	@Override
	public String toString() {
		return "DetalleFacturas [idDetFac=" + idDetFac + ", cantidad=" + cantidad + ", subtotal=" + subtotal
				+ ", factura=" + ", libro= ]";
	}


	
	

	
	
	

}
