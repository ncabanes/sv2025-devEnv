/* 
Challenge 14: Almost prime
Tuenti Contest, 2015 Challenge 2 - Almost prime

A composite number is a positive integer that has at least one positive divisor other than one or the number itself. In other words, a composite number is any positive integer greater than one that is not a prime number.
For example, 14 = 2*7 and 18 = 2*3*3 are composite numbers.

We will say a number is "almost prime" if it has exactly two (not necessarily distinct) prime factors.

For example, the following numbers are almost prime: 6 = 2*3, 25 = 5*5. And the following numbers are not: 17 (prime), 81 = 3*3*3.

Please help us get an idea about how many almost prime numbers there are in certain integer intervals.
Input

The first line contains an integer T, the number of test cases. T lines follow, containing two integers each: A and B, separated by a space.
Output

For each test case, print the number of almost prime numbers P that verify A ≤ P ≤ B.
Constraints

1 ≤ T ≤ 100
1 ≤ A ≤ B ≤ 10^8

Sample input

2
1 10
10 20

Sample output

4
3

*/

import java.util.Scanner;

public class AlmostPrimes  {
    
    public static boolean isPrime(int n) {
        boolean dividerFound = false;
        int i = 2;
        if (n == 1)
            return false;
        while ( i <= Math.sqrt(n) && ! dividerFound) {
            if (n % i == 0) {
                dividerFound = true;
            }
            i++;
        }
        return ! dividerFound;
    }
    
    public static boolean isAlmostPrime(int n) {
        for (int i = 2; i <= n/2; i++)
        {
            if (n % i == 0)
            {
                int firstDivider = i;
                int secondDivider = n / i;
                if (isPrime(firstDivider) &&
                        isPrime(secondDivider))
                    return true;
                else
                    return false;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println(isAlmostPrime(4));
        System.out.println(isAlmostPrime(6));
        System.out.println(isAlmostPrime(8));
        
        int cases = sc.nextInt();
        for (int c = 0; c < cases; c++) {
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
            
            int amount = 0;
            for (int i = n1; i <= n2; i++) {
                if (isAlmostPrime(i)) {
                    System.out.println("n="+i);
                    amount++;
                }
            }
            System.out.println(amount);
        }
    }
}
