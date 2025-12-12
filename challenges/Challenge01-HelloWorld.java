/*
Hello World! (Acepta el Reto 116)

https://aceptaelreto.com/problem/statement.php?id=116

Write a program that prints as many "Hello World" messages as requested.

Input

The input consists of a single line containing a number n,
0 ≤ n ≤ 5, indicating how many messages to print.

Output

Each message will appear on a single line and will be the 
string "Hola mundo."

Example Input
3

Example Output
Hola mundo.
Hola mundo.
Hola mundo.
*/


import java.util.Scanner;

public class Challenge01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int amount = sc.nextInt();
        
        for (int i = 0; i < amount; i++)
        {
            System.out.println("Hola mundo.");
        }
        
    }
}
