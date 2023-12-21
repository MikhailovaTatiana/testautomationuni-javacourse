package salt.testautouni.javacourse.exercises;

import java.util.Random;

/*
 * Roll the Die Game
 */
public class RollTheDieGame {
    public static void main(String[] args) {

        Random random = new Random();

        int rolls = 5;
        int spaces = 20;
        int total = spaces;


        for (int i = 0; i < rolls; i++) {
            System.out.print("Roll #" + (i + 1) + ". ");
            int die = random.nextInt(6) + 1;
            System.out.print("You've rolled a " + die + ". ");
            int place;
            if (spaces - die > 0) {
                spaces = spaces - die;
                place = total - spaces;
                System.out.println("You are now on space " + place + " and have " + (total - place) + " more to go.");
                if (i == rolls - 1) {
                    System.out.println("Sorry, it's not enough so you lost.");
                }
            } else if (spaces - die == 0) {
                System.out.println("You're on space " + total + ". You won!");
                break;
            } else {
                System.out.println("Ups... You are over spaces!");
                break;
            }
        }
    }
}
