/*
Ask the user for their name. 
If it does not start with "Mr. ", 
then add "Mr. / Mrs." at the beginning of it.

Display "Hello " and the edited name.
*/

import java.util.Scanner;

public class Strings03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        if (! name.startsWith("Mr."))
            name = "Mr. / Mrs. " + name;
        
        /*
        if (name.indexOf("Mr.") != 0)
            name = "Mr. / Mrs. " + name;
        */

        System.out.println("Hello " + name);
    }
}
