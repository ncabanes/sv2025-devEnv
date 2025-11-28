// Leibniz series as a PI estimation

import java.util.Scanner;

public class Leibniz {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many terms?");
        int terms = sc.nextInt();
        
        double piFourths = 0;
        
        int numerator = 1;
        int denominator = 1;
        int sign = 1;
        
        for (int i = 0; i < terms; i++)
        {
            piFourths += sign * numerator / (double) denominator;
            
            denominator += 2;
            sign *= -1;
        }
        System.out.println(4 * piFourths);
    }
}

