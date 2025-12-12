/*
 Prepare an array with the amount of days in each month (31, 28, 21, 
 30, …)

 Ask the user for an amount of days and answer if any month has that 
 amount of days.

 */

import java.util.Scanner;

public class Arrays05 {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] daysInMonth = { 31, 28, 31, 30, 31, 30, 31,
            31, 30, 31, 30, 31};

        System.out.print("How many days must have the month? ");
        int days = sc.nextInt();
        
        boolean found = false;
        int i = 0; 
        while (i < daysInMonth.length && ! found)
        {
            if (daysInMonth[i] == days)
                found = true;
            else
                i++;
        }
        if (found)
            System.out.println("Found");
        else
            System.out.println("Not found");
    }
}

