/*
Java Exercise 069b:

Compare how many words are there in the file "words1.txt" (which will 
be shared for you) that do not appear in "words2.txt" (which will also 
be shared).
*/

// Version b: comparing both lists with "contains"

import java.io.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class CompareListOfWords2 {
    public static void main(String[] args) {
        try (BufferedReader inputFile1 = new BufferedReader(
                new FileReader(new File("words1.txt")));
             BufferedReader inputFile2 = new BufferedReader(
                     new FileReader(new File("words2.txt")))){

            List<String> list1 = new ArrayList<>();
            List<String> list2 = new ArrayList<>();

            System.out.println("Reading...");
            String line = null;
            while ((line = inputFile1.readLine()) != null) {
                list1.add(line);
            }
            while ((line = inputFile2.readLine()) != null) {
                list2.add(line);
            }

            System.out.println("Comparing...");
            System.out.println("Started at " + LocalDateTime.now());
            int nonMatching = 0;
            int checked = 0;
            for(String text: list1) {
                checked ++;
                if (!list2.contains(text))
                    nonMatching ++;
                if (checked % 10000 == 0)
                    System.out.print("Checked:" + checked + "  ");
            }
            System.out.println("Finished at " + LocalDateTime.now());
            System.out.println("Non matching: " + nonMatching);
        }
        catch (IOException ioe) {
            System.out.println("I/O error");
        }
    }
}
