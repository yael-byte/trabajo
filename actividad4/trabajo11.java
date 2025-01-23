import java.util.Scanner;

public class trabajo11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero, contador, cuadrado;
        
        while (true) {
           try {
                  System.out.print("Ingresa un número entero positivo: ");
                 numero = Integer.parseInt(scanner.nextLine());
                   if (numero>0){
                        break;
                  }
                    else {
                     System.out.println("Por favor ingresa un número positivo mayor que 0.");
                   }
          } catch(NumberFormatException e){
             System.out.println("Por favor ingresa un numero entero válido.");
         }

      }
        contador = 1;
        do {
         
           cuadrado = contador * contador;
         
          System.out.println("El cuadrado de " + contador + " es: " + cuadrado);
       
          contador++; 
       
     }while (contador <= numero); 

    }
}
