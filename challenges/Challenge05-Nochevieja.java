/*
Challenge 05: Nochevieja
Acepta el reto, 148
https://www.aceptaelreto.com/problem/statement.php?id=148

Ramón spends New Year's Eve counting down the minutes until midnight. 
Can you help him?

Input
The input consists of a series of times, each on a separate line. Each 
time is made up of the hours and minutes separated by colons (smile and 
always using two digits. A 24-hour format is used (i.e., from 00:00 to 23:59).

The input ends when the time is midnight (00:00), which should not be processed.

Output
For each test case, a line will be displayed showing the number of 
minutes remaining until midnight.

Input Example
23:45
21:30
00:01
00:00

Output example
15
150
1439
*/

import java.util.Scanner;

public class Nochevieja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text;

        do {
            text = sc.nextLine();

            if (!text.equals("00:00")) {
                String[] parts = text.split(":");
                int h = Integer.parseInt(parts[0]);
                int m = Integer.parseInt(parts[1]);

                int totalMinutes = h * 60 + m;
                int remaining = 1440 - totalMinutes;

                System.out.println(remaining);
            }

        } while (!text.equals("00:00"));

        sc.close();
    }
}
