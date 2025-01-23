import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5]; // Array para almacenar los 5 números
        int suma = 0;            // Variable para almacenar la suma

        System.out.println("Ingresa 5 números enteros:");

        // Leer los 5 números del teclado y almacenarlos en el array
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            // Sumar el número al total
            suma += numeros[i]; // suma = suma + numeros[i];
        }

        // Mostrar la suma de los elementos
        System.out.println("La suma de los elementos es: " + suma);

        scanner.close();
    }
}
