package com.ipartek.bases;

public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(5 ^ 2);
		System.out.println(Math.pow(5, 2));
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.TAU);
		
		String s = "dfghgfhgf";
		if (s == null || s.isBlank()) {
			System.out.println("No hay texto");
		} else {
			System.out.println(s.toUpperCase());
		}
		
		int a,b,c;
		a = b = c = 0;
		
		System.out.println(a++);
		System.out.println(++b);
		
		++c;
		System.out.println(c);
		
		

	}

}
