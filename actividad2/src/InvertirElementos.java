import java.util.Scanner;
import java.util.Arrays;  // Importa la clase Arrays para facilitar la impresión del array

public class InvertirElementos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6]; // Array para almacenar los 6 números

        System.out.println("Ingresa 6 números enteros:");

        // Leer los 6 números del teclado y almacenarlos en el array
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Invertir el orden de los elementos en el array
        for (int i = 0; i < numeros.length / 2; i++) {
            int temp = numeros[i]; // Guardar el valor del elemento actual en una variable temporal
            numeros[i] = numeros[numeros.length - 1 - i]; // Reemplazar el elemento actual con el elemento del extremo opuesto
            numeros[numeros.length - 1 - i] = temp; // Reemplazar el elemento del extremo opuesto con el valor original
        }

        // Mostrar el array invertido en la consola
        System.out.println("Array invertido: " + Arrays.toString(numeros)); // Imprime el array de forma legible

        scanner.close();
    }
}