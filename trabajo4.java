import java.util.Scanner;

public class trabajo4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double sbm,pi,da;
        System.out.println("introduce tu salario bruto mensual: ");
        sbm=teclado.nextDouble();
        System.out.println("introduce el porcentaje de impuestos:");
        pi=teclado.nextDouble();
        System.out.println("introduce la deducion adicional: ");
        da=teclado.nextDouble();
        double impuesto = (sbm)*(pi/100);
        double SalarioNeto=sbm-impuesto-da;
        System.out.println("el salario neto es: " +SalarioNeto);
        }    
}
