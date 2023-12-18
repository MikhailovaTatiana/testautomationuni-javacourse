package chapter5;

import java.util.Scanner;

/*
 * METHODS
 */
public class Greetings {
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        greetUser(name);
    }

    public static void greetUser(String name) {
        System.out.println("Hi there, " + name + "!");
    }
}
