package com.example;

import java.util.Scanner;

public class Rectangulo {

    public static void main(String[] args) {
        double base,altura,area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese la base del rectangulo");
        base = scanner.nextDouble();
        System.out.println("Por favor ingrese la altura del rectangulo");
        altura = scanner.nextDouble();
        area = base * altura;
        System.out.println("El area del rectangulo es: "+area);
    }


}