package com.ipartek.bases;

public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] enteros = {1,5,7,9,2,5};
		
		for(int entero: enteros) {
			System.out.println("Evaluando: "+entero);
			
			if (entero == 7) {
				System.out.println("Encontrado");
				break;
			}
		}
		
		System.out.println("Fin del programa");
		
		char[][] letras = {{'a', 'b', 'c', 'd'}, {'e', 'f', 'g'}};
		buclePrincipal: for (char[] fila: letras) {
			for(char letra: fila) {
				System.out.println("Evaluando: "+letra);
				if (letra == 'c') {
					System.out.println("Encontrada");
					break buclePrincipal;
				}
			}
		}

	}

}
