import java.util.Scanner;

/**
 * longCalculoFact
 */
public class IntCalculoFact {

    public static void main(String[] args) {
        
        double n, fact = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un numero");
        n = scanner.nextLong();
        System.out.println(fact);

        for (double i = n; i > 1; i--) {

            fact = fact*i;
            
            System.out.println(fact);
            
        }
    }
}