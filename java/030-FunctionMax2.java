/* 
 * Create a function to calculate 
 * and return the maximum of two integer numbers.
 * 
 * (V2: Only one "return")
 */

import java.util.Scanner;

public class FunctionMax2  {
    
    public static int max(int n1, int n2) {
        int maximum = n1;
        if (n2 > n1)
            maximum = n2;
        
        return maximum;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(max(7,5));
        System.out.println(max(5,7));
        System.out.println(max(7,7));
    }
}
