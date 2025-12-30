/*

Challenge 07: Team Lunch
Tuenti Contest, 2015 Challenge 1 - Team Lunch

Today is our bi-weekly team lunch! This time, we're going to our favorite Indian restaurant and we want to know in advance the minimum number of tables required to seat all the team members.

All the tables are square shaped, they must always be joined in a row and there can be no more than one diner seated at each side of a table.
Example for 4 diners:

     O
   +---+
 O | 1 | O
   +---+
     O

4 diners -> 1 table

Example for 5 diners:

     O   O
   +---+---+
 O | 1 | 2 |
   +---+---+
     O   O

5 diners -> 2 tables

Input
In the first line, an integer T indicates the number of cases. Each case is described in a line with an integer N indicating the number of diners.
Output
For each case t, the output is the string Case #t: r where t is the case number and r is the result.
Limits

1 <= T <= 50

0 <= N <= 2^16
Sample Input

8
2
4
6
5
7
3
26073
59794

Sample Output

Case #1: 1
Case #2: 1
Case #3: 2
Case #4: 2
Case #5: 3
Case #6: 1
Case #7: 13036
Case #8: 29896

*/
import java.util.Scanner;

public class TeamLunch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cases = sc.nextInt();

        for (int c = 1; c <= cases; c++) {
            int diners = sc.nextInt();
            int tables;

            if (diners <= 4) {
                tables = 1;
            } else {
                tables = (diners - 1) / 2;
            }

            System.out.println("Case #" + c + ": " + tables);
        }

        sc.close();
    }
}
