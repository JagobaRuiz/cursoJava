package com.ipartek.bases;

import java.util.Arrays;

public class ArraysEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[3];
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		
		for (int dato:arr) {
			System.out.println(dato);
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		char[][] tablero = new char[10][8];
		tablero[0][0] = 'a';
		tablero[9][7] = 'f';
		System.out.println(tablero.length);
		System.out.println(tablero[0].length);
		
		for(int fila = 0; fila < tablero.length; fila ++) {
			for(int columna = 0; columna < tablero[fila].length; columna++) {
				if(tablero[fila][columna] == 0) {
					System.out.print(" . ");
				} else {
					System.out.print(" " + tablero[fila][columna] + " ");
				}
			}
			System.out.println();
		}
	}
}
