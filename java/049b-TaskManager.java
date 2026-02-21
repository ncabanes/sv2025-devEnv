/*

Tasks manager, V2

Version with a typed ArrayList.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> tasks = new ArrayList<>();

        boolean finished = false;
        while (! finished ) {
            displayMenu();

            String option = sc.nextLine().toLowerCase();
            switch(option) {
                case "1": // Add
                    add(sc, tasks);
                    break;
                case "2": // List all
                    listAll(tasks);
                    break;
                case "3": // Delete
                    delete(sc, tasks);
                    break;
                case "4": // Search
                    search(sc, tasks);
                    break;
                case "x": // Exit
                    finished = true;
                    break;
            }
        }
    }

    private static void displayMenu() {
        System.out.println("1- Add a new task");
        System.out.println("2- List all tasks");
        System.out.println("3- Delete a finished task");
        System.out.println("4- Search tasks");
        System.out.println("X- eXit");
    }

    private static void add(Scanner sc, List<String> tasks) {
        System.out.print("Enter the text for the new task: ");
        String text = sc.nextLine();
        tasks.add(text);
    }

    private static void listAll(List<String> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i+1)  +" : " + tasks.get(i));
        }
    }

    private static void delete(Scanner sc, List<String> tasks) {
        System.out.print("Enter the number of the task to delete: ");
        int number = Integer.parseInt( sc.nextLine() ) - 1;
        tasks.remove(number);
    }

    private static void search(Scanner sc, List<String> tasks) {
        System.out.print("Enter the text to search: ");
        String search = sc.nextLine();
        for (int i = 0; i < tasks.size(); i++) {
            String task = tasks.get(i);
            if (task.contains(search)) {
                System.out.println((i + 1) + " : " + (String) tasks.get(i));
            }
        }
    }
}
