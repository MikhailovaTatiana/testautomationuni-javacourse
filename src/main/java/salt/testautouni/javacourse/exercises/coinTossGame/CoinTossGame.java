package salt.testautouni.javacourse.exercises.coinTossGame;

import java.util.Scanner;

public class CoinTossGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the name of player 1?");
        Player player1 = new Player(scan.next());

        System.out.println("What is the name of player 2?");
        Player player2 = new Player(scan.next());

        String givenGuess;
        do {
            System.out.println("What is your guess, " + player1.getName() + ", head or tail?");
            givenGuess = scan.next();
        } while (!givenGuess.equalsIgnoreCase("head") && !givenGuess.equalsIgnoreCase("tail"));
        player1.setGuess(givenGuess.toLowerCase());

        scan.close();

        if (player1.getGuess().equals("head")) {
            player2.setGuess("tail");
        } else player2.setGuess("head");

        String flip = doFlip();
        System.out.println("Flip... It's a " + flip.toUpperCase() + "!");
        if (player1.getGuess().equals(flip)) {
            System.out.println(player1.getName() + " won!");
        } else {
            System.out.println(player2.getName() + " won!");
        }
    }

    private static String doFlip() {
        Coin coin = new Coin();
        coin.flip();
        if (coin.getSide().equals("head")) {
            return "head";
        } else return "tail";
    }
}
