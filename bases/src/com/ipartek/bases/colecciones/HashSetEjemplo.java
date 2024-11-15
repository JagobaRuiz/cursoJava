package com.ipartek.bases.colecciones;

// import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var hs = new LinkedHashSet<String>();
		
		hs.add("Patata");
		hs.add("Uno");
		hs.add("Dos");
		hs.add("Tres");
		hs.add("Cuatro");
		hs.add("Tres");
		
		hs.remove("Patata");
		
	
		System.out.println(hs);
		
		var iterator = hs.iterator();
		
		while(iterator.hasNext()) {
			String dato = iterator.next();
			System.out.println(dato);
		}
		
		for (String dato: hs) {
			System.out.println(dato);
		}
		
		for (String dato: hs) {
			System.out.println(dato);
		}
		
		hs.forEach(dato -> System.out.println(dato));
		hs.forEach(System.out::println);
	}	
}
