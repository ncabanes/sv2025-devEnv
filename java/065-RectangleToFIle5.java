// Rectangle to file, V5
// Fifth version: PrintWriter + compact BufferedReader + try with resources

import java.io.*;

public class RectangleToFile5 {

    static final int ROWS = 5;
    static final int COLUMNS = 10;

    public static void main(String[] args) {
        try (PrintWriter outputFile = new PrintWriter("rectangle.txt")){

            for (int row = 0; row < ROWS; row++) {
                for (int column = 0; column < COLUMNS; column++) {
                    if ((row == 0) || (row == ROWS - 1)
                            || (column == 0) || (column == COLUMNS - 1))
                        outputFile.print("@");
                    else
                        outputFile.print(" ");
                }
                outputFile.println();
            }
        }
        catch(IOException e) {
            System.out.println("File creation error");
        }

        try (BufferedReader inputFile = new BufferedReader(
                new FileReader(new File("rectangle.txt")))){
            String line = null;
            while ((line = inputFile.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (FileNotFoundException fnfe) {
            System.out.println("File not found");
        }
        catch (IOException ioe) {
            System.out.println("Unable to read");
        }
        catch (Exception e) {
            System.out.println("Unexpected error");
        }

    }
}

