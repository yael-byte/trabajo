import java.util.Scanner;

public class Actividad4_Eje10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese un número entero y positivo");
        int num_teclado = scanner.nextInt();
        int i = 1;
        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= num_teclado);
        scanner.close();
    }
}