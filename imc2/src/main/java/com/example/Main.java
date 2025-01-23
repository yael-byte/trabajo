package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso, altura, imc;

        // Solicitar peso hasta que se ingrese un valor válido
        do {
            System.out.print("Ingrese su peso en kilogramos: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
            peso = scanner.nextDouble();
        } while (peso <= 0);

        // Solicitar altura hasta que se ingrese un valor válido
        do {
            System.out.print("Ingrese su altura en metros: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next();
            }
            altura = scanner.nextDouble();
        } while (altura <= 0);

        // Calcular IMC
        imc = peso / (altura * altura);

        // Mostrar IMC con dos decimales
        System.out.printf("Su índice de masa corporal (IMC) es: %.2f\n", imc);

        // Clasificar IMC
        if (imc < 18.5) {
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc < 25) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidad");
        }
    }
}