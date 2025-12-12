/*
Counting in the sand (Acepta el Reto 369)

https://aceptaelreto.com/problem/statement.php?id=369

Input
The input will consist of different numbers greater than 0 and
that will never be greater than 1,000, each on a separate line.

The input ends with a 0, which should not be processed.

Output
For each number, its base-1 encoding should be written on a separate line.

Example input
1
4
6
0

Example output
1
1111
111111
*/

import java.util.Scanner;

public class Challenge02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        
        while(amount > 0) {
            for (int i = 0; i < amount; i++) {
                System.out.print("1");
            }
            System.out.println();
            amount = sc.nextInt();
        }
        
    }
}
