/*
 Ask the user for several floating point numbers (ask them for the 
 amount first). Then, display their average and the values over the 
 average.
 */

import java.util.Scanner;

public class Arrays02 {
    
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float[] data;
        
        System.out.print("How many data? ");
        int amount = sc.nextInt();
        data = new float[amount];
        
        for (int i = 0; i < data.length; i++)
        {
            System.out.print("Enter data "+(i+1)+": ");
            data[i] = sc.nextFloat();
        }
        
        float sum = 0;
        for (int i = 0; i < data.length; i++)
        {
            sum += data[i];
        }
        float average = sum / data.length;
        System.out.println("Average: "+average);
        
        System.out.print("Over the average: ");
        for (int i = 0; i < data.length; i++)
        {
            if (data[i] > average)
                System.out.print(data[i]+ " ");
        }
    }
}

