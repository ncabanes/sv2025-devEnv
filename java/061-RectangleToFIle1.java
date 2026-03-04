// Rectangle to file, V1
// First approach: hollow rectangle in console

public class RectangleToFile1 {

    static final int ROWS = 5;
    static final int COLUMNS = 10;

    public static void main(String[] args) {
        // First way: "if"
        for (int row = 0; row < ROWS; row ++) {
            for (int column = 0; column < COLUMNS; column++) {
                if ((row == 0) || (row == ROWS -1)
                        || (column == 0) || (column == COLUMNS -1))
                    System.out.print("#");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();

        // Second way: first and last row different
        for (int column = 0; column < COLUMNS; column++) {
            System.out.print("#");
        }
        System.out.println();

        for (int row = 0; row < ROWS -2; row ++) {
            System.out.print("#");
            for (int column = 0; column < COLUMNS-2; column++) {
                System.out.print(" ");
            }
            System.out.println("#");
        }

        for (int column = 0; column < COLUMNS; column++) {
            System.out.print("#");
        }
        System.out.println();

    }
}

