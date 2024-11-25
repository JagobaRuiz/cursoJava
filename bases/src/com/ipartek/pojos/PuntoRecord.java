package com.ipartek.pojos;

public record PuntoRecord(int x, int y) {
	// No hace faltas crear los constructores, getters, toString, hashCode ni equals porque los crea el por defecto aunque no se vean
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
	
	
}
