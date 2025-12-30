/*
Challenge 06: Wordle
https://www.codechef.com/problems/WORDLE

Wordle

Chef invented a modified wordle.

There is a hidden word S and a guess word T, both of length 5.

Chef defines a string M to determine the correctness of the guess word. 
For each position the M, if the letter is the same in both S and T, a 
letter "G" will be displayed, or a letter "B" otherwise.

Input Format
First line will contain N, number of test cases. Then the test cases follow.
Each test case contains of two lines of input.
First line contains the string S - the hidden word.
Second line contains the string T - the guess word.

Output Format
For each test case, print the value of string M.

Sample 1:
Input
3
ABCDE
EDCBA
ROUND
RINGS
START
STUNT

Output
BBGBB
GBBBB
GGBBG

Explanation:
Test Case 1: ABCDE and EDCBA. The string M is BBGBB, as only the third letter is correct.
Test Case 2: ROUND and RINGS. The string M is GBBBB (only the first letter is good).
*/

import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        for (int c = 0; c < N; c++) {
            String S = sc.nextLine();
            String T = sc.nextLine();

            StringBuilder M = new StringBuilder();

            for (int i = 0; i < 5; i++) {
                if (S.charAt(i) == T.charAt(i)) {
                    M.append('G');
                } else {
                    M.append('B');
                }
            }

            System.out.println(M.toString());
        }

        sc.close();
    }
}
