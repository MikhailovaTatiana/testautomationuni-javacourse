package chapter3;

import java.util.Scanner;

/*
 IF Statement.
 All salespeople get a payment of $1,000 a week.
 For any of them who make more than 10 sales that week, they get an additional bonus of $250.
 */
public class SalaryCalculator {
    public static void main(String[] args) {

        //Initialize known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for the unknown
        System.out.println("How many sales did the employee make this week?");
        Scanner scan = new Scanner(System.in);
        int sales = scan.nextInt();
        scan.close();

        //Quick detour for the bonus earners
        if (sales > quota) {
            salary = salary + bonus;
        }

        //Output
        System.out.println("The employee's pay is $" + salary);
    }
}
