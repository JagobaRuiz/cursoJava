package com.ipartek.bases;

import java.util.Scanner;

public class Consola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner (System.in)) {
			System.out.println("Dime texto: ");
			String prueba = sc.nextLine();
		
			System.out.println(prueba);
		}
	}
	
	/*El finally se ejecuta siempre, aunque de error no controlado en el catch*/
}
