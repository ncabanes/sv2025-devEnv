/* 
 * Create a function to know if a certain integer 
 * number is a prime number.
 */

import java.util.Scanner;

public class FunctionIsPrime2  {
    
    public static boolean isPrime(int n) {
        boolean dividerFound = false;
        int i = 2;
        if (n == 1)
            return false;
        while ( i <= Math.sqrt(n) && ! dividerFound) {
            if (n % i == 0) {
                dividerFound = true;
            }
            i++;
        }
        return ! dividerFound;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 20; i++) {
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }
}
