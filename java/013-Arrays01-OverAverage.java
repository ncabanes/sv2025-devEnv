/*
 Ask the user for 10 floating point numbers. Then, display their 
 average and the values over the average.
 */


import java.util.Scanner;

public class Arrays01 {
    
    public static void main (String[] args) {
        
        float[] data = new float[10];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++)
        {
            System.out.print("Enter data "+(i+1)+": ");
            data[i] = sc.nextFloat();
        }
        
        float sum = 0;
        for (int i = 0; i < 10; i++)
        {
            sum += data[i];
        }
        float average = sum / 10;
        System.out.println("Average: "+average);
        
        System.out.print("Over the average: ");
        for (int i = 0; i < 10; i++)
        {
            if (data[i] > average)
                System.out.print(data[i]+ " ");
        }
    }
}

