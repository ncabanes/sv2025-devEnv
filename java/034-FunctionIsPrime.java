/* 
 * Create a function to know if a certain integer 
 * number is a prime number.
 */

import java.util.Scanner;

public class FunctionIsPrime  {
    
    public static boolean isPrime(int n) {
        int dividers = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                dividers++;
            }
        }
        return dividers == 2;
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
