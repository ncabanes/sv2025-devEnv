/*
Pentavocalic 

Challenge 04: Pentavocalic Words
Acepta el reto, 300
https://aceptaelreto.com/problem/statement.php?id=300

Input

The input begins with a number indicating the number of test cases that follow. 
Each case consists of a word of no more than 30 letters from a to z (all 
lowercase, without accents, and excluding the letter ñ).

Output

For each test case, the program will output "SI" if the word contains all five 
vowels, and "NO" otherwise.

Example Input
4
albaricoque
seculariza
peliagudo
abracadabra

Example Output
SI
NO
SI
NO
*/

import java.util.Scanner;

public class Challenge04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < cases; i++)
        {
            String word = sc.nextLine();
            if (word.contains("a") && word.contains("e")  && word.contains("i")
                     && word.contains("o")   && word.contains("u"))
                System.out.println("SI");
            else
                System.out.println("NO");
        }
    }
}
