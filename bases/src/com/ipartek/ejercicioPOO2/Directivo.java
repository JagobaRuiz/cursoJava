package com.ipartek.ejercicioPOO2;

public class Directivo extends Empleado {

	public Directivo(String nombre) {
		super(nombre);
	}
	
	public Directivo() {
		super("Anónimo");
	}

	@Override
	public String toString() {
		return super.toString() + " Directivo";
	}
}
