package com.ipartek.bases.fechas;

import java.util.Date;

//JAVA 1.0
public class DateEjemplo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date fecha = new Date(2024 - 1900, 11 - 1 , 14);
		
		System.out.println(fecha);
		System.out.println(fecha.getYear() + 1900);

	}

}
