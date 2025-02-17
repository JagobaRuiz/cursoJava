package com.ipartek.ejercicioPOO3;

import javax.swing.JOptionPane;

public class Pruebas {

    public static void main(String[] args) {

        //Introducimos los datos
        String nombre = JOptionPane.showInputDialog("Introduce el nombre");

        String texto = JOptionPane.showInputDialog("Introduce la edad");
        int edad = Integer.parseInt(texto);

        texto = JOptionPane.showInputDialog("Introduce el sexo");
        char sexo = texto.charAt(0);

        texto = JOptionPane.showInputDialog("Introduce el peso");
        double peso = Double.parseDouble(texto);

        texto = JOptionPane.showInputDialog("Introduce la altura");
        double altura = Double.parseDouble(texto);

        //Creamos objetos con cada constructor
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);

        //Los datos que no esten completos los insertamos con los metodos set
        persona1.setNombre("Laura");
        persona1.setEdad(30);
        persona1.setSexo('M');
        persona1.setPeso(60);
        persona1.setAltura(1.60);

        persona2.setPeso(90.5);
        persona2.setAltura(1.80);

        //Usamos metodos para realizar la misma accion para cada objeto
        System.out.println("Persona1");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());

        System.out.println("Persona2");
        MuestraMensajePeso(persona2);
        MuestraMayorDeEdad(persona2);
        System.out.println(persona2.toString());

        System.out.println("Persona3");
        MuestraMensajePeso(persona3);
        MuestraMayorDeEdad(persona3);
        System.out.println(persona3.toString());
    }

    public static void MuestraMensajePeso(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case Persona.BUENPESO:
                System.out.println(p.getNombre() + " está en su peso ideal");
                break;
            case Persona.INFRAPESO:
                System.out.println(p.getNombre() + " está por debajo de su peso ideal");
                break;
            case Persona.SOBREPESO:
                System.out.println(p.getNombre() + " está por encima de su peso ideal");
                break;
        }
    }

    public static void MuestraMayorDeEdad(Persona p) {

        if (p.esMayorDeEdad()) {
            System.out.println(p.getNombre() + " es mayor de edad");
        } else {
            System.out.println(p.getNombre() + " no es mayor de edad");
        }
    }

}