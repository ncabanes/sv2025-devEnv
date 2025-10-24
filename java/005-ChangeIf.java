// 005: Change (if)

/*
Ask the user how much are they going to pay for their coffee (which 
costs 0.85 €). Answer with the change or the message "Not enough 
money".
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float payment;
        Scanner sc = new Scanner(System.in);

        System.out.print("Payment? ");
        payment = sc.nextFloat();

        if (payment >= 0.85)
            System.out.println("Your change is: " + (payment - 0.85));
        else
            System.out.println("Not enough money");

        sc.close();
    }
}
