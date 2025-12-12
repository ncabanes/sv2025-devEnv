/*
Watermelon (Codeforces 4A)

https://codeforces.com/problemset/problem/4/A

Pete and Billy are great fans of even numbers, that's why they want to 
divide the watermelon in such a way that each of the two parts weighs 
even number of kilos, at the same time it is not obligatory that the 
parts are equal.

Input
The first (and the only) input line contains integer number w 
(1 ≤ w ≤ 100) — the weight of the watermelon bought by the boys.

Output
Print YES, if the boys can divide the watermelon into two parts, 
each of them weighing even number of kilos; and NO in the 
opposite case.

Examples:
Input
8
Output
YES
*/

import java.util.Scanner;

public class Challenge03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kilos = sc.nextInt();
        
        if((kilos % 2 == 0)  && (kilos > 2))
            System.out.print("YES");
        else
            System.out.print("NO");
    }
}
