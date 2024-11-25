package com.ipartek.ejercicioPOO3;

public class Persona {
	
	private static final char SEXO_DEF = 'H';
	public static final int INFRAPESO = -1;
	public static final int BUENPESO = 0;
	public static final int SOBREPESO = 1;
	
	
	private String nombre;
	private int edad;
	private String dni;
	private char sexo;
	private double peso;
	private double altura;
	
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		setNombre(nombre);
		setEdad(edad);
		setDni();
		setSexo(sexo);
		setPeso(peso);
		setAltura(altura);
	}

	public Persona(String nombre, int edad, char sexo) {
		this(nombre, edad, sexo, 0.0, 0.0);
	}

	public Persona() {
		this ("", 0, SEXO_DEF, 0.0, 0.0);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public void setDni() {
		final int divisor = 23;
		 
        //Generamos un número de 8 digitos
        int numDNI = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int res = numDNI - (numDNI / divisor * divisor);
 
        //Calculamos la letra del DNI
        char letras[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        char letraDNI = letras [res];
 
        //Pasamos el DNI a String
        dni = Integer.toString(numDNI) + letraDNI;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		if (sexo == 'H' || sexo == 'M') {
			this.sexo = sexo;
		} else {
			this.sexo = SEXO_DEF;
		}
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public boolean esMayorDeEdad() {
		if (edad < 18) {
			return false;
		} else {
			return true;
		}
	}
	
	public int calcularIMC() {
		double imc = peso/(Math.pow(altura, 2));
		
		if (imc < 20) {
			return INFRAPESO;
		} else if (imc >=20 || imc <=25) {
			return BUENPESO;
		} else {
			return SOBREPESO;
		}
		
	}
	
	@Override
    public String toString() {
        String sexo;
        if (this.sexo == 'H') {
            sexo = "hombre";
        } else {
            sexo = "mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + dni + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }
		

}
