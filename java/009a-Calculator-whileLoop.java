/*
Ask the user for a integer number, an operator and another integer 
number, and display the result of such operation, like in this example:

First number? 5
Operator? +
Second number? 7

5 + 7 = 12

The program must repeat until the user presses Enter instead of typing 
in a first number

Version 1: "while"

*/

import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        //int a = sc.nextInt();
        String aTxt = sc.nextLine();
        
        while (! aTxt.equals(""))
        {
            int a = Integer.parseInt(aTxt);
            
            System.out.print("Enter the operation: ");
            String operator = sc.nextLine();
            
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();
            sc.nextLine();
            
            switch(operator) {
                case "+":
                    System.out.println(a+"+"+b+"="+(a+b));
                    break;

                case "-":
                    System.out.println(a+"-"+b+"="+(a-b));
                    break;
                
                case "*":
                case "x":
                case "·":
                    System.out.println(a+operator+b+"="+(a*b));
                    break;
                
                case "/":
                    System.out.println(a+"/"+b+"="+((float)a/b));
                    break;
                
                default:
                    System.out.println("Unknown operator");
            }
            
            System.out.print("Enter the first number: ");
            aTxt = sc.nextLine();
        }
    }
}

