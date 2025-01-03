package com.ipartek.bases.fechas;

// import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class javaTimeEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime ld = LocalDateTime.of(2024, 11, 14, 8, 15);
		
		System.out.println(ld);
		
		LocalDateTime finCurso = ld.plusMonths(3);
		System.out.println(finCurso);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yyyy HH:mm");
		System.out.println(dtf.format(ld));
		
		String texto = "01/febrero/2025 13:37";
		LocalDateTime ldt = LocalDateTime.parse(texto, dtf);
		System.out.println(ldt);

	}

}
