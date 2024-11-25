package com.ipartek.bases;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FicherosTexto {
	private static final String RUTA_FICHERO = "fichero.txt";

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter(RUTA_FICHERO);
		PrintWriter pw = new PrintWriter(fw);
		
		pw.println("Una línea");
		pw.println("Otra línea");
		pw.close();
		fw.close();
		
		FileReader fr = new FileReader(RUTA_FICHERO + "asa");
		Scanner sc = new Scanner(fr);
		while(sc.hasNext()) {
			System.out.println("Línea: "+ sc.nextLine());
		}
		sc.close();
		fr.close();
	}

}
