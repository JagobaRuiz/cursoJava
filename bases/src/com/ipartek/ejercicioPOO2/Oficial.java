package com.ipartek.ejercicioPOO2;

public class Oficial extends Operario {

	public Oficial(String nombre) {
		super(nombre);
	}
	
	public Oficial() {
		super("Anónimo");
	}

	@Override
	public String toString() {
		return super.toString() + " Oficial";
	}
	
}
