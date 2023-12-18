package chapter4;

import java.util.Scanner;

/*
 * LOOP BREAK
 */
public class LetterSearch {
    public static void main(String[] args) {
        System.out.println("Enter some text:");
        Scanner scan = new Scanner (System.in);
        String text = scan.next();
        scan.close();

        boolean letterFound = false;
        
        // Search text for letter A
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }

        if (letterFound) {
            System.out.println("This text contains the letter 'A'");
        } else {
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}
