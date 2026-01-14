/* 
 * Create a function called "quadruple", which modifies 
 * the variable it receives as a parameter, to convert 
 * it into its quadruple.
 * 
 * V2 (correct): returning the modified value
 */

import java.util.Scanner;

public class FunctionQuadruple2  {
    
    public static int quadruple(int n) {
        n *= 4;
        System.out.println("In the function: " + n);
        return n;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = 5;
        int b = quadruple(a);
        System.out.println("After the function: " + b);
    }
}
