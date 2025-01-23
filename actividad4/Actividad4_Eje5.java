import java.util.Scanner;

public class Actividad4_Eje5 {
     public static void main(String[] args )  {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Por favor ingrese un número:");
        String num = scanner.nextLine();
        int Numero_Teclado = num.length();
        System.out.println("El número de dígitos de su número es: " + Numero_Teclado);
        
        scanner.close();

     }
}
