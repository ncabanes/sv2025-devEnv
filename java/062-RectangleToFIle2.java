// Rectangle to file, V2
// Second version: PrintWriter + close

import java.io.IOException;
import java.io.PrintWriter;

public class RectangleToFile2 {

    static final int ROWS = 5;
    static final int COLUMNS = 10;

    public static void main(String[] args) {

        try {

            PrintWriter file = new PrintWriter("rectangle.txt");

            for (int row = 0; row < ROWS; row++) {
                for (int column = 0; column < COLUMNS; column++) {
                    if ((row == 0) || (row == ROWS - 1)
                            || (column == 0) || (column == COLUMNS - 1))
                        file.print("#");
                    else
                        file.print(" ");
                }
                file.println();
            }

            file.close();
        }
        catch(IOException e) {
            System.out.println("File creation error");
        }
    }
}

