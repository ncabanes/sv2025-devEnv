/*
Java Exercise 066a:

Ask the user for the name of a text file and copy it to another file 
that will have (almost) the same name, but ending in ".2.txt", and 
containing the same lines of the original file, but converted to uppercase.
*/

// Version a: opening & closing

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileToUpper1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file name: ");
        String inputName = sc.nextLine();
        String outputName = inputName + ".2.txt";

        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            br = new BufferedReader(new FileReader(inputName));
            pw = new PrintWriter(outputName);

            String line;
            while ((line = br.readLine()) != null) {
                pw.println(line.toUpperCase());
            }

            System.out.println("Done!");

        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());

        } finally {
            try {
                if (pw != null) pw.close();
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Unable to close: " + e.getMessage());
            }
        }
    }
}
