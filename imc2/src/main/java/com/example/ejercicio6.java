package com.example;

import java.util.Scanner;

public class ejercicio6 {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        System.out.println("Seleccione la conversión deseada:");
        System.out.println("1. Celsius a Fahrenheit");
        System.out.println("2. Celsius a Kelvin");
        System.out.println("Opción: ");
        int opcion = scanner.nextInt();

        double resultado;

        switch (opcion) {
            case 1:
                resultado = celsius * 9 / 5 + 32;
                System.out.println(celsius + " grados Celsius equivalen a " + resultado + " grados Fahrenheit.");
                break;
            case 2:
                resultado = celsius + 273.15;
                System.out.println(celsius + " grados Celsius equivalen a " + resultado + " Kelvin.");
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}


