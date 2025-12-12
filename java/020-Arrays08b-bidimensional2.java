/*
 Ask the user for the marks of two groups of 
 5 students. Display the highest mark in 
 each group.
 (V2: conventional search for the maximum)
 */

import java.util.Scanner;
import java.util.Arrays;

public class Arrays08b {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float[][] marks = new float[2][5];
        
        for (int group = 0; group < marks.length; group++)
        {
            for (int mark = 0; mark < marks[group].length; mark++)
            {
                System.out.print("Enter mark (" + (group+1) + ","
                    +  (mark+1) +"): ");
                marks[group][mark] = sc.nextFloat();
            }
        }
        
        for (int group = 0; group < marks.length; group++)
        {
            float max = marks[group][0];
            for (int i = 1; i < marks[group].length; i++)
                if (marks[group][i] > max)
                    max = marks[group][i];
            System.out.println("Max = "+ max);
        }
    }
}

