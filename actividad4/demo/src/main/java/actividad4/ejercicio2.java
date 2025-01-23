package actividad4;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números: ");
        int cantidadNumeros = scanner.nextInt();

        int mayoresCero = 0;
        int menoresCero = 0;
        int igualesCero = 0;

        for (int i = 1; i <= cantidadNumeros; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                mayoresCero++;
            } else if (numero < 0) {
                menoresCero++;
            } else {
                igualesCero++;
            }
        }

        System.out.println("Cantidad de números mayores que 0: " + mayoresCero);
        System.out.println("Cantidad de números menores que 0: " + menoresCero);
        System.out.println("Cantidad de números iguales a 0: " + igualesCero);
    }
}

