/*
Java Exercise 068:


172 Create a "logger": each time the user runs the program, they 
will be asked for a sentence and it will be added to the "log.txt"
file, preceded by the date in the format "YYYY-MM-DD HH:mm".

*/


import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Stack;

public class Logger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text to be logged: ");
        String text = sc.nextLine();

        try (PrintWriter pw = new PrintWriter(
                    new BufferedWriter(
                    new FileWriter("log.txt", true)))) {
                pw.println(
                        LocalDateTime.now().format(
                                DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm"))+
                        " - " + text );
        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }
}
