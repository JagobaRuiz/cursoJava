package com.ipartek.bases.colecciones;

import java.util.ArrayList;

public class ArrayListEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var al = new ArrayList<String>();
		
		al.add("Patata");
		al.add("Uno");
		al.add("Tres");
		al.add("Cuatgo");
		al.add("Tres");
		
		al.remove("Patata");
		al.add(1, "Dos");
		al.set(3, "Cuatro");
		al.remove(4);
		
	
		System.out.println(al.get(0));
		System.out.println(al);
		
		var iterator = al.iterator();
		
		while(iterator.hasNext()) {
			String dato = iterator.next();
			System.out.println(dato);
		}
		
		for (String dato: al) {
			System.out.println(dato);
		}
		
		for (String dato: al) {
			System.out.println(dato);
		}
		
		al.forEach(dato -> System.out.println(dato));
		al.forEach(System.out::println);
	}	
}
