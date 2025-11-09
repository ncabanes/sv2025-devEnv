// Ask the user for three integer numbers and display the greatest one of them.

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int num1,num2,num3;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Enter me the first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter me the second number: ");
        num2 = sc.nextInt();
        System.out.print("Enter me the third number: ");
        num3 = sc.nextInt();
        
        if(num1 >= num2 && num1 >= num3)
        {
            System.out.println("The number " + num1 +  " is the greatest");
        }
        else if(num2 >= num1 && num2 >= num3)
        {
            System.out.println("The number " + num2 +  " is the greatest");
        }
        else
        {
            System.out.println("The number " + num3 +  " is the greatest");
        }
    }
}
