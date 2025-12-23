/* Task manager V0.02
First approach to our Task manager:
The user will have the options to:
 - Add a Task (not working yet)
 - View all Tasks (not working yet)
 - Exit

0.01 - Basic structure
0.02 - Using enum
*/

import java.util.Scanner;
import java.util.Arrays;

public class Tasks02  {
    public static void main(String[] args) {
        enum options { EXIT, ADD, VIEW };
        Scanner sc = new Scanner(System.in);
        int option;
        do
        {
            System.out.println("1-Add a task");
            System.out.println("2-View all tasks");
            System.out.println("0-Exit");
            option = sc.nextInt();
            
            switch(option)
            {
                case 1:
                    System.out.println("Adding... some day");
                    break;
                case 2:
                    System.out.println("Viewing... some day");
                    break;
                case options.EXIT.ordinal():
                    System.out.println("Bye!");
                    break;
            }
        }
        while (option != 0);
    }
}
