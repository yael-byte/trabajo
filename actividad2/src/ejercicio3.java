import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8]; 
        int mayor = Integer.MIN_VALUE; 
        int menor = Integer.MAX_VALUE; 

        System.out.println("Ingresa 8 números enteros:");

        
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();

            
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);

        scanner.close();
    }
}