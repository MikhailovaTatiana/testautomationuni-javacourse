package salt.testautouni.javacourse.chapter4;

import java.util.Scanner;

/*
 * NESTED LOOP
 */
public class AverageTestScores {
    public static void main(String[] args) {

        int numOfStudents = 24;
        int numOfTests = 4;

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numOfStudents; i++) {
            double total = 0;
            for (int j = 0; j < numOfTests; j++) {
                System.out.println("Enter the score for the test #" + (j + 1));
                double score = scan.nextDouble();
                total = total + score;
            }
            double average = total / numOfTests;
            System.out.println("The test average for student #" + (i + 1) + " is " + average + "\n");
        }
        scan.close();
    }
}
