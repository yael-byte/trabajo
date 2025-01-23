import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra;

        System.out.println("Ingresa palabras (ingresa un espacio en blanco para terminar):");

        while (true) {
            System.out.print("Ingresa una palabra: ");
            palabra = scanner.nextLine();  

            if (palabra.trim().isEmpty()) { 
                System.out.println("Fin del programa.");
                break;
            }

            String palabraEnMayusculas = palabra.toUpperCase();
            System.out.println("Palabra en mayúsculas: " + palabraEnMayusculas);
        }

        scanner.close();
    }
}