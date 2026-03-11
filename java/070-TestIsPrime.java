/* 
 * Create a function to know if a certain integer 
 * number is a prime number.
 * 
 * Version with simple tests
 */

public class TestIsPrime  {
    
    public static boolean isPrime(int n) {
        int dividers = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                dividers++;
            }
        }
        return dividers == 2;
    }
    
    public static void main(String[] args) {
        if (!isPrime(1)) System.out.println("1 Ok"); else System.out.println("1 Fails");
        if (isPrime(2)) System.out.println("2 Ok"); else System.out.println("2 Fails");
        if (isPrime(3)) System.out.println("3 Ok"); else System.out.println("3 Fails");
        if (!isPrime(4)) System.out.println("4 Ok"); else System.out.println("4 Fails");
        if (isPrime(5)) System.out.println("5 Ok"); else System.out.println("5 Fails");
        if (!isPrime(6)) System.out.println("6 Ok"); else System.out.println("6 Fails");
        if (!isPrime(27)) System.out.println("27 Ok"); else System.out.println("27 Fails");
        if (!isPrime(50)) System.out.println("50 Ok"); else System.out.println("50 Fails");
        if (!isPrime(100000)) System.out.println("100000 Ok"); else System.out.println("100000 Fails");
    }
}
