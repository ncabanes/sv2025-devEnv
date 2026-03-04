// Rectangle to file, V3
// Third version: PrintWriter + finally

import java.io.IOException;
import java.io.PrintWriter;

public class RectangleToFile3 {

    static final int ROWS = 5;
    static final int COLUMNS = 10;

    public static void main(String[] args) {
        PrintWriter file = null;
        try {

            file = new PrintWriter("rectangle.txt");

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


        }
        catch(IOException e) {
            System.out.println("File creation error");
        }
        finally {
            if (file != null)
                file.close();
        }
    }
}

