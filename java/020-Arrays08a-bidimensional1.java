/*
 Ask the user for the marks of two groups of 
 5 students. Display the highest mark in 
 each group.
 (V1: ".sort")
 */

import java.util.Scanner;
import java.util.Arrays;

public class Arrays08a {
    
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
            Arrays.sort(marks[group]);
            System.out.println("Max = "+ 
                marks[group][marks[group].length-1]);
        }
    }
}

