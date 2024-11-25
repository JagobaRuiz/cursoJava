package com.ipartek.ejercicioPOO1;

public class PruebasCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var c1 = new Cuenta("Jagoba", 100.0);
		var c2 = new Cuenta("Aitor");
		
		c1.retirar(101.50);
		System.out.println(c1.toString());
		c1.ingresar(224.88);
		System.out.println(c1.toString());
		
		c2.retirar(50.26);
		System.out.println(c2.toString());
		c2.ingresar(99.99);
		System.out.println(c2.toString());
		
	}

}
