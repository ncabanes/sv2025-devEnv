/*
 Prepare an array with the amount of days in each month (31, 28, 21, 
 30, …)

 Ask the user for an amount of days and answer how many months have 
 that amount of days.

 */

import java.util.Scanner;

public class Arrays04 {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31,
            31, 30, 31, 30, 31};

        System.out.print("How many days must have the month? ");
        int days = sc.nextInt();
        
        int count = 0;
        for (int d : daysInMonth)
        {
            if (d == days)
                count++;
        }
        System.out.println("Found "+count+" times");
    }
}

