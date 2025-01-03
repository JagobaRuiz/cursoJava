package com.ipartek.bibliotecas;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.function.Function;

public class Consola {
	private static final boolean NO_REQUERIDO = false;
	public static final boolean REQUERIDO = true;
	private static final Scanner SC = new Scanner(System.in);
	
	
	public static void pl() {
		System.out.println();
	}
	
	public static void p(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static void pl(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static void pl(Object objeto) {
		System.out.println(objeto);
	}
	
	public static String leerString(String mensaje, boolean requerido) {
		if (requerido) {
			return leerAlgo(mensaje, texto -> { //Mensaje es lo que se le pasa y texto lo que devuelve; Todo lo de dentro es lo que se ejecuta
				if (texto.isBlank()) {
					throw new IllegalArgumentException("El texto no puede estar vacío");
				}

				return texto.trim();
			});
		}

		p(mensaje + ": ");
		return SC.nextLine();
	}

	public static String leerString(String mensaje) {
		return leerString(mensaje, NO_REQUERIDO);
	}

	
	public static int leerEntero(String mensaje) {
		return leerAlgo(mensaje, (texto -> Integer.parseInt(texto)));
	}
	
	public static Long leerLong(String mensaje) {
		return leerAlgo(mensaje, Long::parseLong);
	}
	
	public static LocalDate leerFecha(String mensaje) {
		return leerAlgo(mensaje, (texto -> LocalDate.parse(texto)));
	}
	
	public static BigDecimal leerBigDecimal(String mensaje) {
		return leerAlgo(mensaje, texto -> new BigDecimal(texto));
	}
	
	private static <T> T leerAlgo(String mensaje, Function<String, T> cachoCodigo)  {
		T valor = null;
		boolean hayError = true;
		
		do {
			String texto = leerString(mensaje);
		try {
			valor = cachoCodigo.apply(texto);
			hayError = false;
		} catch (Exception e) { //Se puede poner mas de un catch pero siempre ordenado del mas específico al mas genérico
			pl("El valor introducido no es válido");
		}
	} while (hayError);
		return valor;
	}
}
