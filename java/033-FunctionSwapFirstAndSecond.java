/* 
 * Create a function called "swapFirstAndSecond", 
 * which swaps the values of the first and second 
 * data in an array of integers which it will 
 * receive as a parameter.
 * 
 * (Example of parameters passed by reference)
 */

import java.util.Scanner;

public class FunctionSwapFirstAndSecond  {
    
    public static void swapFirstAndSecond(int[] data) {
        int temp = data[0];
        data[0] = data[1];
        data[1] = temp;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numbers = {5, 4, 3, 2, 1};
        swapFirstAndSecond(numbers);
        for(int n: numbers) {
            System.out.println(n);
        }
    }
}
