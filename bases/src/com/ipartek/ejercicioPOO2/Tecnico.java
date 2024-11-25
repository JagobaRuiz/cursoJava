package com.ipartek.ejercicioPOO2;

public class Tecnico extends Operario {

	public Tecnico(String nombre) {
		super(nombre);
	}
	
	public Tecnico() {
		super("Anónimo");
	}

	@Override
	public String toString() {
		return super.toString() + " Tecnico";
	}
	
	
}
