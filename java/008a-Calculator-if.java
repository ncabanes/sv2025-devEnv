/*
Ask the user for a integer number, an operator and another integer 
number, and display the result of such operation, like in this example:

First number? 5
Operator? +
Second number? 7

5 + 7 = 12

Version 1: if
*/

import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("First number? ");
        int a = sc.nextInt();
        sc.nextLine();  // Empty the buffer
        
        System.out.print("Operator? ");
        String operator = sc.nextLine();
        
        System.out.print("Second number? ");
        int b = sc.nextInt();
        
        if (operator.equals("+")) {
            System.out.println(a+"+"+b+"="+(a+b));
        }
        else  if (operator.equals("-")) {
            System.out.println(a+"-"+b+"="+(a-b));
        }
        else  if (operator.equals("*")) {
            System.out.println(a + "*" + b + "=" + (a*b));
        }
        else  if (operator.equals("/")) {
            System.out.println(a + "/" + b + "=" + ((float)a/b));
        }
        else {
            System.out.println("Unknown operator");
        }
    }
}

