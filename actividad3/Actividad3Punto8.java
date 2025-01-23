import java.util.Scanner;

public class Actividad3Punto8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Ingrese el nombre de un artista, película o serie que sea de su preferencia:");
        String entrada = scanner.nextLine().toLowerCase(); 

       
        switch (entrada) {
            case "natanael cano":
                System.out.println("Natanael Cano es el creador y principal exponente de los corridos tumbados.");
                break;

            case "breaking bad":
                System.out.println("Breaking Bad es una serie de televisión estadounidense sobre un profesor de química que se convierte en un fabricante de metanfetaminas.");
                break;

            case "avatar":
                System.out.println("Avatar es una película de ciencia ficción dirigida por James Cameron que explora el mundo de Pandora.");
                break;

            case "stranger things":
                System.out.println("Stranger Things es una serie de Netflix que combina ciencia ficción y terror, ambientada en los años 80.");
                break;

            case "harry potter":
                System.out.println("Harry Potter es una serie de libros y películas de fantasía sobre un joven mago que lucha contra el malvado Lord Voldemort.");
                break;

            default:
                System.out.println("Lo siento, no tengo información sobre ese artista, película o serie.");
                break;
        }

        scanner.close(); 
    }
}