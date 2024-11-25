package com.ipartek.pruebas;

import java.time.LocalDate;

import com.ipartek.pojos.Persona;

public class PersonaPruebas {
	
	public static void main(String[] args) {
		var p = new Persona();
		
		p.setNombre("Jagoba");
		p.setFechaNacimiento(LocalDate.of(1996, 12, 12));
		System.out.println(p.getNombre());
		System.out.println(p.getFechaNacimiento());
		
		var p1 = new Persona(1L, "Jagoba Ruiz", LocalDate.of(1996, 3, 24));
		System.out.println(p1.toString());
		System.out.println(p1.getEdad());
		
		var p2 = new Persona(p1);
		p2.setId(2L);
		p2.setNombre("Otro Otrez");
		System.out.println(p2.toString());
		
	}

}
