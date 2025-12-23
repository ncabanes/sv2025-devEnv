/*
 Ask the user for 10 double precision real numbers.
 Sort them.
 Display them from lowest to highest.
 Display a blank line. 
 Display them from highest to lowest.
 */

import java.util.Scanner;
import java.util.Arrays;

public class ArrayReview {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number "+(i+1)+": ");
            numbers[i] = sc.nextDouble();
        }
        
        Arrays.sort(numbers);
        
        // Ascending
        for(double n: numbers) {
            System.out.println(n);
        }
        
        System.out.println();
        
        // Descending
        for (int i = numbers.length-1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }
    }
}
