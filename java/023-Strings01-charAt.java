/*
Ask the user for their name and display it 
with an extra blank space after each letter.
*/

import java.util.Scanner;

public class Strings01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        
        System.out.print("Hi, ");
        
        for (int i = 0; i < name.length(); i++)
            System.out.print(name.charAt(i)+" ");
        System.out.println();
        
        /* Not valid in Java (but valid in C#):
        for (char c : name)
            System.out.print(c+" ");
        System.out.println();
        */
    }
}
