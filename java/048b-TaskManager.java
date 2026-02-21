/*

Tasks manager, V1

We want to create a Task List, using an untyped ArrayList.

In this first approach, we will use a String to write down each task. 
We want to be able to:

1, Add a new task
2. Watch all tasks
3. Delete a (finished) task
4. Search tasks containing a certain text

There must be a menu allowing the user to repeat these options until 
the user chooses to exit (X) the program.

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List tasks = new ArrayList();

        boolean finished = false;
        while (! finished ) {
            System.out.println("1- Add a new task");
            System.out.println("2- List all tasks");
            System.out.println("3- Delete a finished task");
            System.out.println("4- Search tasks");
            System.out.println("X- eXit");

            String option = sc.nextLine().toLowerCase();
            switch(option) {
                case "1": // Add
                    System.out.print("Enter the text for the new task: ");
                    String text = sc.nextLine();
                    tasks.add(text);
                    break;
                case "2": // List all
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i+1)  +" : " + (String) tasks.get(i));
                    }
                    break;
                case "3": // Delete
                    System.out.print("Enter the number of the task to delete: ");
                    int number = Integer.parseInt( sc.nextLine() ) - 1;
                    tasks.remove(number);
                    break;
                case "4": // Search
                    System.out.print("Enter the text to search: ");
                    String search = sc.nextLine();
                    for (int i = 0; i < tasks.size(); i++) {
                        String task = (String) tasks.get(i);
                        if (task.contains(search)) {
                            System.out.println((i + 1) + " : " + (String) tasks.get(i));
                        }
                    }
                    break;
                case "x": // Exit
                    finished = true;
                    break;
            }
        }
    }
}
