// Sum two numbers entered by the user, using "Scanner"

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer number: ");
        n1 = sc.nextInt();

        System.out.print("Enter the second integer number: ");
        n2 = sc.nextInt();

        System.out.println("The sum is: " + n1 + n2);

        sc.close();
    }
}
