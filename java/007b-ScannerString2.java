/*
Ask the user for their name and their age and tell them that they seem 
younger (or older, as you please):

What's your name? Samuel

What's your age? 18

Wow! You look like 19, Samuel

(Version 2: Asking for the number first)

*/

 
import java.util.Scanner;
 
public class Main
{   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("How old are you?: ");
        int age = sc.nextInt();
        sc.nextLine(); // Let's empty the input buffer
                
        System.out.print("What's your name?: ");
        String name = sc.nextLine();
        
        System.out.print("Wow! " + name + 
            ", you look like you're " + (age - 1) +".");
    }
}
