/*
 Ask the user for 5 marks. Display the highest one.
 */

import java.util.Scanner;

public class Arrays06 {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        
        for (int i = 0; i < marks.length; i++)
        {
            System.out.print("Enter mark " + (i+1) + ": ");
            marks[i] = sc.nextFloat();
        }
        
        float max = marks[0];
        for (int i = 1; i < marks.length; i++)
            if (marks[i] > max)
                max = marks[i];
        System.out.print("Max = "+ max);
    }
}

