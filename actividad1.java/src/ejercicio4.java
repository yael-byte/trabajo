import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa una cadena de texto: ");
        String texto = scanner.nextLine();

        System.out.print("Ingresa el caracter que deseas reemplazar: ");
        char caracterOriginal = scanner.next().charAt(0); 

        System.out.print("Ingresa el caracter de reemplazo: ");
        char caracterNuevo = scanner.next().charAt(0);

        String textoModificado = texto.replace(caracterOriginal, caracterNuevo);

        System.out.println("Texto modificado: " + textoModificado);

        scanner.close();
    }
}