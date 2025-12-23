/*
Ask the user for their name and their password. 
Do no let them go on until they enter the 
correct name ("user") and the correct password
("password").
*/

import java.util.Scanner;

public class Strings02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name, password;

        do
        {
            System.out.print("Enter your name: ");
            name = sc.nextLine();
            System.out.print("Enter your password: ");
            password = sc.nextLine();
            
            if (!(name.equals("user")) 
                || !(password.equals("password")))
            {
                System.out.println("Access denied");
            }
        }
        while (!(name.equals("user") 
            && password.equals("password")));
        
        System.out.println("Access granted");
    }
}
