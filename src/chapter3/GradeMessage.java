package chapter3;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade:");
        Scanner scan = new Scanner(System.in);
        String grade = scan.next();

        String message;

        switch(grade) {
            case "A":
               message = "Exellent job!";
               break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a bit harder.";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade.";
                break;
        }

        System.out.println(message);
    }
}
