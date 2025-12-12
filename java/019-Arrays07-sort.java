/*
 Ask the user for 5 marks. 
 Display the highest one. (V2: sort the array first)
 */

import java.util.Scanner;
import java.util.Arrays;

public class Arrays07 {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        
        for (int i = 0; i < marks.length; i++)
        {
            System.out.print("Enter mark " + (i+1) + ": ");
            marks[i] = sc.nextFloat();
        }
        
        Arrays.sort(marks);
        System.out.print("Max = "+ marks[marks.length-1]);
    }
}

