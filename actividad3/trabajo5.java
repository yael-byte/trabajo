import java.util.Scanner;

public class trabajo5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mes;

        // Paso 1: Pedir al usuario el número de mes (1-12)
        System.out.print("Ingresa el número de mes (1-12): ");
        mes = scanner.nextInt();
     
       // Paso 2: Validar si el número de mes es válido, con uso de un If en este caso,  sólo se realiza una validacion en caso de un mes incorrecto.
        if (mes < 1 || mes > 12) {
          System.out.println("Número de mes no válido.");
       } else{
            // Paso 3: Determinar la estación usando switch
           System.out.print("Estación: ");
           switch (mes) {
               case 1:
               case 2:
               case 12:
                  System.out.println("Invierno");
                   break;
               case 3:
                case 4:
                case 5:
                  System.out.println("Primavera");
                 break;
               case 6:
                case 7:
                case 8:
                  System.out.println("Verano");
                   break;
               case 9:
               case 10:
               case 11:
                    System.out.println("Otoño");
                    break;
          }
        }

         scanner.close();
    }
}