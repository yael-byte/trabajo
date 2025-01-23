import java.util.Scanner;

public class ejercicio2 {

    public static boolean esPalindromo(String texto) {
       
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        String textoInvertido = new StringBuilder(texto).reverse().toString();
        return texto.equals(textoInvertido);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String cadena = scanner.nextLine();

        if (esPalindromo(cadena)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es palindromo");
        }

        scanner.close();
    }
}