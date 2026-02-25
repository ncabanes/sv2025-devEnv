import java.util.Scanner;
import java.util.Stack;

public class StacksExample {
    public static void main(String[] args) {
        Stack<String> figure = new Stack<>();
        Scanner sc = new Scanner(System.in);
        boolean finished = false;

        do {
            System.out.print("Enter a line of the figure to invert (empty to end): ");
            String line = sc.nextLine();
            if (line == "") {
                finished = true;
            }
            else {
                figure.push(line);
            }
        }
        while (! finished);

        while( ! figure.isEmpty() ) {
            String extractedLine = figure.pop();
            System.out.println( extractedLine );
        }

    }
}