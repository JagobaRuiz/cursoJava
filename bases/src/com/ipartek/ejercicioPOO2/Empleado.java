package com.ipartek.ejercicioPOO2;

public class Empleado {
	private String nombre;

	public Empleado(String nombre) {
		setNombre(nombre);
	}

	public Empleado() {
		this("Anónimo");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Empleado " + nombre;
	}
	
	
	
	

}
