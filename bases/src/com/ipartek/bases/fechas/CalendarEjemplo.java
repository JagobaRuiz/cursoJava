package com.ipartek.bases.fechas;
// import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarEjemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar gc =  new GregorianCalendar(2024, 11 - 1, 14);
		System.out.println(gc.get(Calendar.YEAR));
		System.out.println(gc.get(Calendar.MONTH) + 1);

	}

}
