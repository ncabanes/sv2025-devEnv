/*
Challenge 11: Leaky Roof
Acepta el reto, 216
https://www.aceptaelreto.com/problem/statement.php?id=216

With the arrival of the rains, you've discovered an annoying leak in the living 
room. With Swiss precision, the drops fall once per second from the ceiling 
into a bucket that you're forced to empty periodically until you find a 
solution. Living with a leaky roof is complicated because you have to 
synchronize your life around emptying the bucket...

Input

The input will consist of a first number indicating how many test cases will 
follow.

Each test case will be a number greater than zero representing the number of 
drops that enter the bucket.

Output

For each test case, the program will print the maximum time you can go without 
changing the bucket in the format HH:MM:SS, where HH indicates the number of 
hours, MM the number of minutes, and SS the number of seconds.

No bucket is large enough to last more than a full day without needing to be changed.

Example Input
3
70
3600
3661

Example Output
00:01:10
01:00:00
01:01:01
*/

import java.util.Scanner;

public class LeakyRoof {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();
        for (int i = 0; i < cases; i++) {
            int drops = sc.nextInt();

            int hours = drops / 3600;
            drops %= 3600;
            int minutes = drops / 60;
            int seconds = drops % 60;

            System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
        }

        sc.close();
    }
}
