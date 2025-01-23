import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10]; 
        int pares = 0;        
        int impares = 0;      

        System.out.println("Ingresa 10 números enteros:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            
            if (numeros[i] % 2 == 0) {
                pares++; 
            } else {
                impares++;
            }
        }

        
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);

        scanner.close();
    }
}