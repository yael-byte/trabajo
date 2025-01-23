import java.util.Scanner;

public class Actividad4_Eje4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 100 ; i++)  {
            if (i % 3 == 0 && i % 5 == 0) {  
                System.out.println(i);
            }
        }
    }
}
