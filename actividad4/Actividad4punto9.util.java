import java.util.Scanner;

public class Actividad4punto9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true; 

        System.out.println("Bienvenido a la calculadora básica!");

        while (continuar) {
            
            System.out.println("\nSeleccione una operación:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

           
            if (opcion < 1 || opcion > 5) {
                System.out.println("Opción no válida. Intente de nuevo.");
                continue;
            }

            
            if (opcion == 5) {
                System.out.println("Gracias por usar la calculadora. ¡Adiós!");
                break;
            }

            
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

           
            switch (opcion) {
                case 1: 
                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case 2: 
                    System.out.println("Resultado: " + (num1 - num2));
                    break;

                case 3: 
                    System.out.println("Resultado: " + (num1 * num2));
                    break;

                case 4: 
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;
            }

            
            System.out.print("\n¿Desea realizar otra operación? (s/n): ");
            char respuesta = scanner.next().toLowerCase().charAt(0);

            if (respuesta != 's') {
                continuar = false;
                System.out.println("Gracias por usar la calculadora. ¡Adiós!");
            }
        }

        scanner.close(); 
    }
}
