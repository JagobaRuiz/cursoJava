package com.ipartek.bases;

import java.util.function.BiFunction;

public class Calculadora {
	public static void main(String[] args) {
		int op1 = 5;
		int op2 = 2;

		Operacion sumar = new Sumar();

		System.out.println(sumar.operar(op1, op2));
		
		//Función anónima
		Operacion restar = new Operacion() {
			@Override
			public int operar(int... ops) {
				return ops[0] - ops[1];
			}
		};

		System.out.println(restar.operar(op1, op2));
		
		//el (ops) es un Lambda, en éste caso como Operación solo tiene una función que es operar, hace referencia a ella
		Operacion multiplicar = (ops) -> {
			int productorio = 1;

			for (int dato : ops) {
				productorio *= dato;
			}

			return productorio;
		};

		System.out.println(multiplicar.operar(op1, op2));
		System.out.println(multiplicar.operar(5, 4, 23, 3));

		// BiFunction es una función que admite 2 valores y te devuelve un tercero
		BiFunction<Integer, Integer, Integer> dividir = (o1, o2) -> o1 / o2;

		System.out.println(dividir.apply(op1, op2));
	}

	interface Operacion {
		//int... ops significa que se le pasan tantos parámetros como queramos, luego él lo coge como array.
		int operar(int... ops);
	}

	static class Sumar implements Operacion {
		public int operar(int... ops) {
			int total = 0;

			for (int dato : ops) {
				total += dato;
			}

			return total;
		}
	}
}