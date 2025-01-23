import java.util.Random;
import java.util.Scanner;

public class trabajo6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          Random random = new Random();
        int numeroAleatorio, suposicion;
        boolean adivinado = false;
         numeroAleatorio = random.nextInt(100) + 1;
        do {
         
          System.out.print("Adivina un número entre 1 y 100: ");
          suposicion = scanner.nextInt();
          if(suposicion < numeroAleatorio) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
           } else if (suposicion > numeroAleatorio) {
              System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                  adivinado = true;  
                   System.out.println("¡Correcto! Adivinaste el número.");
           }

       } while(!adivinado); 

    }
}
