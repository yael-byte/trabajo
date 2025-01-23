import java.util.Scanner;

public class trabajo12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio, diferencia, maximo, valorActual;
      
          System.out.print("Ingresa el primer número de la secuencia: ");
          inicio = scanner.nextInt();
           System.out.print("Ingresa la diferencia constante entre números: ");
          diferencia = scanner.nextInt();

           System.out.print("Ingresa el número máximo de la secuencia: ");
          maximo = scanner.nextInt();
         if(maximo <= inicio){
           System.out.println("El número máximo debe ser superior al número de inicio");
      }else{
            valorActual = inicio;
            do{
               System.out.print(valorActual + " ");
                valorActual = valorActual + diferencia;
            
          } while(valorActual<= maximo);
    
      }
    }
}
