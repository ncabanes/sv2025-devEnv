// Change

import java.util.Scanner;

public class Main {
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Amount to pay?");
        int total = sc.nextInt();
        System.out.println("Payment?");
        int payment = sc.nextInt();
        int change = payment - total;
        
        while (change > 100)
        {
            System.out.print("100 ");
            change -= 100;
        }
        
        while (change > 10)
        {
            System.out.print("10 ");
            change -= 10;
        }
        
        while (change > 5)
        {
            System.out.print("5 ");
            change -= 5;
        }
        
        while (change > 1)
        {
            System.out.print("1 ");
            change -= 1;
        }
    }
}

