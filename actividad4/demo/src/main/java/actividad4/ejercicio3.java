package actividad4;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una palabra: ");
        String palabra = scanner.nextLine();

        int contadorA = 0;
        
        palabra = palabra.toLowerCase();
        for (int i = 0; i < palabra.length(); i++) {
            char caracter = palabra.charAt(i);
            if (caracter == 'a') {
                contadorA++;
            }
        }

        System.out.println("La letra 'a' aparece " + contadorA + " veces en la palabra.");
    }
}
