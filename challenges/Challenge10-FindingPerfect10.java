/*
(First Bolivian Computer Science Olympiad, Level 3, Type 1, Problem 1)

You are given all the grades you have received in a subject. Each grade is an 
integer between 0 and 10 inclusive.

Assuming you get a 10 on all your upcoming assignments, determine the number of 
assignments needed to achieve a perfect 10. You will receive a 10 if your 
average is 9.5 or higher.

For example, if your grades are 8 and 9, then you will require 4 additional 
assignments in which you must get a 10. With each assignment, your average will 
increase to 9, 9.25, 9.4, and 9.5.

Input

The input is on a single line containing all the grades obtained, separated by 
commas.

Output

Write on one line the number of tasks required to obtain a 10.

Input examples

9,10,10,9
8,9
0,0,0,0,0,0,0,0,0,0,0
10,10,10,10

Output examples
0
4
247
0

The problem you must solve:

Write a program that finds the answer for the following input:
7,7,10,10,4,6,4,6,0,6,7,4,6,6,9

The answer you should obtain is:
101
*/

import java.util.Scanner;

public class FindingPerfect10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String[] parts = line.split(",");

        int sum = 0;
        int amount = parts.length;

        for (String p : parts) {
            sum += Integer.parseInt(p);
        }

        double average = (double) sum / amount;
        int extraTasks = 0;

        while (average < 9.5) {
            sum += 10;
            amount++;
            extraTasks++;
            average = (double) sum / amount;
        }

        System.out.println(extraTasks);

        sc.close();
    }
}
