/*

Tasks manager, V5

Version with a class "Task" + Comparator
*/

import java.util.*;

// ---------------------------

class Task  {
    protected String description;
    protected byte priority;

    public Task(String description, byte priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public byte getPriority() {
        return priority;
    }

    public void setPriority(byte priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return description + " (" + priority +")";
    }
}
// ---------------------------


public class TaskManager {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Task> tasks = new ArrayList<>();

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

    private static void add(Scanner sc, List<Task> tasks) {
        System.out.print("Enter the text for the new task: ");
        String text = sc.nextLine();
        System.out.print("Enter the priority for the new task: ");
        byte priority = Byte.parseByte( sc.nextLine() );
        tasks.add( new Task(text, priority) );
        Collections.sort(tasks, new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return -1 * (o1.priority - o2.priority);
            }
        });
    }

    private static void listAll(List<Task> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i+1)  +" : " + tasks.get(i));
        }
    }

    private static void delete(Scanner sc, List<Task> tasks) {
        System.out.print("Enter the number of the task to delete: ");
        int number = Integer.parseInt( sc.nextLine() ) - 1;
        tasks.remove(number);
    }

    private static void search(Scanner sc, List<Task> tasks) {
        System.out.print("Enter the text to search: ");
        String search = sc.nextLine();
        for (int i = 0; i < tasks.size(); i++) {
            String task = tasks.get(i).getDescription();
            if (task.contains(search)) {
                System.out.println((i + 1) + " : " + tasks.get(i));
            }
        }
    }
}
