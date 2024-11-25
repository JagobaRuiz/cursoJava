package com.ipartek.ejercicioPOO1;

public class Cuenta {
	private String titular;
	private Double cantidad;
	
	public Cuenta(String titular, Double cantidad) {
		setTitular(titular);
		setCantidad(cantidad);
	}

	public Cuenta(String titular) {
		this(titular, 0.0);
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getCantidad() {
		return cantidad;
	}

	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	
	public void ingresar(Double ingreso) {
		this.cantidad = this.cantidad + ingreso;
	}
	
	public void retirar(Double retiro) {
		if (retiro > this.cantidad) {
			this.cantidad = (double) 0;
		} else {
			this.cantidad = this.cantidad - retiro;
		}
	}

	@Override
	public String toString() {
		return "El cliente " + titular + " tiene " + cantidad + "€ en su cuenta";
	}
	
	
	
	
	

}
