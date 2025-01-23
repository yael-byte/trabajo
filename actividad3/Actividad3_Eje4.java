import java.util.Scanner;

public class Actividad3_Eje4  {
    
    public static void main(String[] args) {
        double compra, descuento;
        Scanner scanner = new Scanner(System.in);           
        System.out.println("Ingrese el precio total de su compra: ");
        compra = scanner.nextDouble();
        if (compra > 100 && compra <= 200) {
            descuento = compra * .10;
            System.out.println("El descuento de su compra es de:"+ descuento);
        } else if (compra > 200 && compra <= 500) {
            descuento = compra * .20;
            System.out.println("El descuento de su compra es de:"+ descuento);
        } else if (compra > 500) {
            descuento = compra * .25;
            System.out.println("El descuento de su compra es de:"+ descuento);
        } else {
            System.out.println("Su compra no tiene descuento");

            scanner.close();
        }

    }
}  