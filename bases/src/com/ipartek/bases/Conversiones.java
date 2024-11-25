package com.ipartek.bases;

import java.time.LocalDate;

public class Conversiones {
	@SuppressWarnings("unused")

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numero = "5";
		int i = Integer.parseInt(numero);
		
		String numeroDouble  = "5.2";
		double d = Double.parseDouble(numeroDouble);
		
		String fecha = "2024-12-11";
		LocalDate ld = LocalDate.parse(fecha);
		
		String texto = "s";
		boolean b = "s".trim().equals(texto);
		
		String letra = "dsfsadsffdsfds";
		char c = letra.trim().charAt(0);
				
		

	}

}
