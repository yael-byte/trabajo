package com.example;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la calificación numérica:");
        int calificacion = scanner.nextInt();

        char calificacionLetra;

        if (calificacion >= 90) {
            calificacionLetra = 'A';
        } else if (calificacion >= 80) {
            calificacionLetra = 'B';
        } else if (calificacion >= 70) {
            calificacionLetra = 'C';
        } else if (calificacion >= 60) {
            calificacionLetra = 'D';
        } else {
            calificacionLetra = 'F';
        }

        System.out.println("La calificación letra es: " + calificacionLetra);
    }
}

    
    

