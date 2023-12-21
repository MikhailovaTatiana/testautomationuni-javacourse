package salt.testautouni.javacourse.exercises;

import java.util.Objects;
import java.util.Scanner;

public class PasswordValidator {

    private static Scanner scan = new Scanner(System.in);
    private static final String OLD_PASSWORD = "myOldPass.123";
    private static final String USER_NAME = "MyNameAsUser";
    private static final int MIN_NUMBER_OF_CHARS = 8;
    private static final char[] SPECIAL_CHARS = {'.', ',', ':', ';', '/', '@', '&', '$', '%', '+', '-', '*', '_'};


    public static void main(String[] args) {
        totalCheckAndPrint();
        scan.close();
    }

    private static String getPass() {
        System.out.println("Enter a new password:");
        return scan.next();
    }

    private static void totalCheckAndPrint() {
        String newPass;
        boolean ch1;
        boolean ch2;
        boolean ch3;
        boolean ch4;
        boolean ch5;
        do {
            newPass = getPass();
            ch1 = checkIfNewPassEqualsOldPass(newPass);
            ch2 = checkNumberOfChars(newPass);
            ch3 = checkIfContainsUserName(newPass);
            ch4 = checkIfContainsUpperCaseLetter(newPass);
            ch5 = checkIfContainsSpecialChar(newPass);
        } while (ch1 || ch2 || ch3 || ch4 || ch5);
        System.out.println("You've changed your password to '" + newPass + "' successfully!");
    }

    private static boolean checkIfNewPassEqualsOldPass(String newPass) {
        return Objects.equals(newPass, OLD_PASSWORD);
    }

    private static boolean checkNumberOfChars(String newPass) {
        return newPass.length() < MIN_NUMBER_OF_CHARS;
    }

    private static boolean checkIfContainsUserName(String newPass) {
        return newPass.toLowerCase().contains(USER_NAME.toLowerCase());
    }

    private static boolean checkIfContainsUpperCaseLetter(String newPass) {
        for (int i = 0; i < newPass.length(); i++) {
            if (Character.isUpperCase(newPass.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkIfContainsSpecialChar(String newPass) {
        for (int i = 0; i < newPass.length(); i++) {
            for (int j = 0; j < SPECIAL_CHARS.length; j++) {
                if (newPass.charAt(i) == SPECIAL_CHARS[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
