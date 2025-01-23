import java.util.Scanner;

public class Actividad4punto8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double suma = 0; 
        int contador = 0; 

        System.out.println("Ingrese números positivos uno por uno.");
        System.out.println("El programa finalizará cuando ingrese un número negativo.\n");

        while (true) {
            System.out.print("Ingrese un número: ");
            double numero = scanner.nextDouble();

            
            if (numero < 0) {
                System.out.println("Ha ingresado un número negativo. El programa finalizará.");
                break;
            }

            suma += numero; 
            contador++; 
        }

        
        if (contador > 0) {
            double promedio = suma / contador; 
            System.out.println("La media de los números ingresados es: " + promedio);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        scanner.close(); 
    }
}
