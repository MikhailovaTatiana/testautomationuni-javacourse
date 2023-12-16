package chapter3;

import java.util.Scanner;

public class DollarGame {
    public static void main(String[] args) {
        System.out.println("You need to take exactly $1 with coins (pennies, nickles, dimes and/or quarters).");

        Scanner scan = new Scanner(System.in);
        System.out.println("How many pennies ($0.01)?");
        int pennies = scan.nextInt();
        System.out.println("How many nickles? ($0.05)");
        int nickles = scan.nextInt();
        System.out.println("How many dimes? ($0.1)");
        int dimes = scan.nextInt();
        System.out.println("How many quarters? ($0.25)");
        int quarters = scan.nextInt();
        scan.close();

        int count = pennies * 1 + nickles * 5 + dimes * 10 + quarters * 25;
        int dollar = 100;
        int balance;

        if (count == dollar) {
            System.out.println("Congrats! You won!");
        } else if (count < dollar && count > 0) {
            balance = dollar - count;
            System.out.println("You need to add " + balance + " cents!");
        } else if (count > dollar) {
            balance = count - dollar;
            System.out.println("You've taken " + balance + " cents more!");
        } else {
            System.out.println("You've picked invalid value!");
        }
    }
}
