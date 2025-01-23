import java.util.Scanner;

public class Actividad4punto7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letra; 
        
        System.out.println("Ingrese una letra para determinar si es una vocal o una consonante.");
        System.out.println("El programa terminará si ingresa un espacio.\n");
        
        do {
            System.out.print("Ingrese una letra: ");
            String entrada = scanner.nextLine().toLowerCase(); 
            
           
            if (entrada.length() != 1) {
                System.out.println("Por favor, ingrese un solo carácter.");
                continue;
            }
            
            letra = entrada.charAt(0); 
            
            
            if (letra == ' ') {
                System.out.println("Has ingresado un espacio. Fin del programa.");
                break;
            }
            
            
            if (Character.isLetter(letra)) {
                
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println("La letra '" + letra + "' es una vocal.");
                } else {
                    System.out.println("La letra '" + letra + "' es una consonante.");
                }
            } else {
                System.out.println("El carácter ingresado no es una letra.");
            }
        } while (true); 
        
        scanner.close(); 
    }
}
