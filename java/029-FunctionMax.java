/* 
 * Create a function to calculate 
 * and return the maximum of two integer numbers.
 * 
 * (First approach: several "return")
 */

import java.util.Scanner;

public class FunctionMax  {
    
    public static int max(int n1, int n2) {
        if (n1 > n2)
            return n1;
        else
            return n2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(max(7,5));
        System.out.println(max(5,7));
        System.out.println(max(7,7));
    }
}
