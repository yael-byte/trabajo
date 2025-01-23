import java.util.Scanner;

public class Actividad3punto2util {
    public static void main(String[] args) {
        double adn; 
        Scanner teclado = new Scanner(System.in); 

        System.out.println("Ingrese su año de nacimiento:"); 
        adn = teclado.nextDouble(); 

        
        if (adn <= 2006) {
            System.out.println("Usted puede votar");
        } else {
            System.out.println("Usted no puede votar");
        }
    }
}
