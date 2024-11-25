package com.ipartek.pruebas;

import static com.ipartek.bibliotecas.Consola.*;

public class ConsolaPruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pl("Hola");
		String texto = leerString("Dime un texto");
		pl(texto);
		
		int entero = leerEntero("Dime un entero");
		
		pl("El entero es: "+ entero);

	}

}
