/*
Java Exercise 067:

Ask the user for the name of a text file and copy it to another file 
that will have (almost) the same name, but ending in ".2.txt", and 
containing the same lines of the original file, but inverted (from
last to forst) and converted to uppercase.
*/

// Version a: opengin & closing


import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class InvertFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> lines = new Stack<>();

        System.out.print("Enter the file name: ");
        String inputName = sc.nextLine();
        String outputName = inputName + ".2.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(inputName));
             PrintWriter pw = new PrintWriter(new FileWriter(outputName))) {

            String line;
            while ((line = br.readLine()) != null) {
                lines.push(line.toUpperCase());
            }

            while(! lines.isEmpty()) {
                pw.println( lines.pop() );
            }

            System.out.println("Done!");
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
