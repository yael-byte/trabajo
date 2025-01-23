import java.util.Scanner;

public class ejercicio1 {

    public static int calcularMCD(int num1, int num2) {
        // Algoritmo de Euclides para calcular el MCD
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int numero2 = scanner.nextInt();

        int mcd = calcularMCD(numero1, numero2);

        System.out.println("El máximo común divisor de " + numero1 + " y " + numero2 + " es: " + mcd);

        scanner.close();
    }
}
