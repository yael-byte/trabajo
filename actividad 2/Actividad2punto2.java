import java.util.Scanner; 

public class Actividad2Punto2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        double num1, num2, num3, promedio;
        System.out.println("Ingrese el primer numero:");
        num1 = teclado.nextDouble();

        System.out.println("Ingrese el segundo numero:");
        num2 = teclado.nextDouble();

        System.out.println("Ingrese el tercer numero:");
        num3 = teclado.nextDouble();
        promedio = (num1 + num2 + num3) / 3;
        System.out.println("El promedio de los tres números es: " + promedio);

        teclado.close();
    }
}