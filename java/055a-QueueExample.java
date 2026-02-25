import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueExample {
    public static void main(String[] args) {
        Queue<String> attendants = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        boolean finished = false;

        do {
            System.out.print("Enter the name of an attendant: ");
            String line = sc.nextLine();
            if (line == "") {
                finished = true;
            }
            else {
                attendants.add(line);
            }
        }
        while (! finished);

        while( ! attendants.isEmpty() ) {
            String extractedLine = attendants.remove();
            System.out.println( extractedLine );
        }

    }
}