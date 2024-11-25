package com.ipartek.ejercicioPOO2;

public class Operario extends Empleado {

	public Operario(String nombre) {
		super(nombre);
	}
	
	public Operario() {
		super("Anónimo");
	}

	@Override
	public String toString() {
		return super.toString() + " Operario";
	}
}
