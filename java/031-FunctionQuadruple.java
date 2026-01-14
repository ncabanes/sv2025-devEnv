/* 
 * Create a function called "quadruple", which modifies 
 * the variable it receives as a parameter, to convert 
 * it into its quadruple.
 * 
 * V1: passing by value (wrong)
 */

import java.util.Scanner;

public class FunctionQuadruple  {
    
    public static void quadruple(int n) {
        n *= 4;
        System.out.println("In the function: " + n);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = 5;
        quadruple(a);
        System.out.println("After the function: " + a);
    }
}
