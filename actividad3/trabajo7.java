import java.util.Scanner;

public class trabajo7 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        double pesosMx, cantidadConvertida;
        int opcionMoneda;

        System.out.print("Ingresa la cantidad en pesos mexicanos: ");
        pesosMx = scanner.nextDouble();
          if(pesosMx<0) {
              System.out.println("Cantidad no valida");
         }else {
               System.out.println("¿A qué moneda deseas convertir?");
               System.out.println("1. Dólar (USD)");
               System.out.println("2. Euro (EUR)");
               System.out.println("3. Bath (THB)");
               System.out.println("4. Yen (JPY)");
               System.out.println("5. Won (KRW)");
               System.out.println("6. Dólar Australiano (AUD)");
               System.out.println("7. Sol (PEN)");
               System.out.println("8. Dólar Canadiense (CAD)");
               System.out.println("9. Bolívar (VES)");
              System.out.println("10. Peso Argentino (ARS)");
         
           System.out.print("Ingresa tu opción: ");
           opcionMoneda = scanner.nextInt();
             switch (opcionMoneda) {
                 case 1: // USD
                  cantidadConvertida = pesosMx / 17.00;
                   System.out.printf("%.2f pesos mexicanos equivalen a %.2f USD\n", pesosMx, cantidadConvertida);
                   break;
                 case 2: // EUR
                   cantidadConvertida = pesosMx / 18.50;
                   System.out.printf("%.2f pesos mexicanos equivalen a %.2f EUR\n", pesosMx, cantidadConvertida);
                  break;
               case 3: // THB
                  cantidadConvertida = pesosMx / 0.5;
                  System.out.printf("%.2f pesos mexicanos equivalen a %.2f THB\n", pesosMx, cantidadConvertida);
                  break;
               case 4:  // JPY
                    cantidadConvertida = pesosMx / 0.11;
                    System.out.printf("%.2f pesos mexicanos equivalen a %.2f JPY\n", pesosMx, cantidadConvertida);
                   break;
                 case 5: // KRW
                    cantidadConvertida = pesosMx / 0.013;
                     System.out.printf("%.2f pesos mexicanos equivalen a %.2f KRW\n", pesosMx, cantidadConvertida);
                     break;
               case 6:  // AUD
                    cantidadConvertida = pesosMx / 11.2;
                    System.out.printf("%.2f pesos mexicanos equivalen a %.2f AUD\n", pesosMx, cantidadConvertida);
                  break;
                case 7: // PEN
                     cantidadConvertida = pesosMx / 4.7;
                      System.out.printf("%.2f pesos mexicanos equivalen a %.2f PEN\n", pesosMx, cantidadConvertida);
                      break;
                case 8:   // CAD
                      cantidadConvertida = pesosMx / 13.00;
                      System.out.printf("%.2f pesos mexicanos equivalen a %.2f CAD\n", pesosMx, cantidadConvertida);
                   break;
                  case 9:  // VES
                       cantidadConvertida = pesosMx / 21.25;
                     System.out.printf("%.2f pesos mexicanos equivalen a %.2f VES\n", pesosMx, cantidadConvertida);
                   break;
                case 10:  // ARS
                      cantidadConvertida = pesosMx / 0.043;
                       System.out.printf("%.2f pesos mexicanos equivalen a %.2f ARS\n", pesosMx, cantidadConvertida);
                     break;

                  default:
                      System.out.println("Opción no válida.");
          }
      }
    }
}
