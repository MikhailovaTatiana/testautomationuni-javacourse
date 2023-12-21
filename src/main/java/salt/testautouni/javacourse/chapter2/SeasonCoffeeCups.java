package salt.testautouni.javacourse.chapter2;

import java.util.Scanner;

public class SeasonCoffeeCups {
    public static void main(String[] args) {
        // 1. Asks a user for a season of the year
        System.out.println("Enter a season of the year.");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        // 2. Get a whole number
        System.out.println("Enter a whole number.");
        int cups = scanner.nextInt();

        // 3. Get an adjective
        System.out.println("Write an adjective.");
        String adjective = scanner.next();
        scanner.close();

        // 4. Complete the sentence
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum " + cups + " cups of coffee.");
    }
}
