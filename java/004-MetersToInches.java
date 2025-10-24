// Convert meters to inches

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int meters;
        Scanner sc = new Scanner(System.in);

        System.out.print("How many meters? ");
        meters = sc.nextInt();

        System.out.println("Inches: " + meters * 39.37);

        sc.close();
    }
}
