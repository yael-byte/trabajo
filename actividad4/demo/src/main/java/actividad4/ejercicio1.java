package actividad4;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero no negativo: ");
        int numero = scanner.nextInt();

        long factorial = 1;

        if (numero < 0) {
            System.out.println("El factorial no se puede para números negativos.");
        } else {
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }
    }
}