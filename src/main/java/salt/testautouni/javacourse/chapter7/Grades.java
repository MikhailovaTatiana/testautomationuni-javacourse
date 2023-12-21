package salt.testautouni.javacourse.chapter7;

import java.util.Scanner;

public class Grades {
    private static int grades[];
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many grades would you like to enter?");
        grades = new int[scanner.nextInt()];

        getGrades();

        scanner.close();

        System.out.println("Average: " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest: " + getHighestGrade());
        System.out.println("Lowest: " + getLowestGrade());
    }

    private static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter grade #" + (i + 1));
            grades[i] = scanner.nextInt();
        }
    }

    private static int calculateSum() {
        int sum = 0;
        for (int grade: grades) {
            sum = sum + grade;
        }
        return sum;
    }

    private static double calculateAverage() {
        return (double) calculateSum() / grades.length;
    }

    private static int getHighestGrade() {
        int highest = grades[0];
        for (int grade: grades) {
            if (grade > highest) {
                highest = grade;
            }
        }

        return highest;
    }

    private static int getLowestGrade() {
        int lowest = grades[0];
        for (int grade: grades) {
            if (grade > lowest) {
                lowest = grade;
            }
        }

        return lowest;
    }
}
