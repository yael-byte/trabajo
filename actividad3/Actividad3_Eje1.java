import java.util.Scanner;

public class Actividad3_Eje1 {
    public static void main(String[] args) {
        double parcial, proyecto, Examen;
        double calif_final;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Por favor ingrese las calificaciones de sus parciales");
        parcial = scanner.nextDouble();
        System.out.println("Por favor ingrese la calificación de su proyecto");
        proyecto = scanner.nextDouble();
        System.out.println("Por favor ingresa la calificacion de examen");
        Examen = scanner.nextDouble();
        calif_final = (parcial * 0.4) + (proyecto * .3) + (Examen * .3);
        System.out.println("Tu calificación final es: " +calif_final );
    }
}