package exercises;

import java.util.Scanner;

public class PhoneBillCalculator {
    static Scanner scan = new Scanner(System.in);
    static double tax = 0.15;
    static double costForExtraMin = 0.25;

    public static void main(String[] args) {

        double planFee = getPlanFee();
        int minutes = getOverageMinutes();
        scan.close();

        System.out.format("Phone Bill Statement\nPlan: $%.2f\n", planFee);

        double overage = calculateOverage(minutes);
        double userTax = calculateTax(planFee, overage);
        calculateTotalCost(planFee, overage, userTax);
    }

    public static double getPlanFee() {
        System.out.println("Enter base cost of the plan:");
        double fee = scan.nextDouble();
        return fee;
    }

    public static int getOverageMinutes() {
        System.out.println("Enter overage minutes:");
        int minutes = scan.nextInt();
        return minutes;
    }

    public static double calculateOverage(int minutes) {
        double overage = costForExtraMin * minutes;
        System.out.format("Overage: $%.2f\n", overage);
        return overage;
    }

    public static double calculateTax(double planFee, double overage) {
        double userTax = (planFee + overage) * tax;
        System.out.format("Tax: $%.2f\n", userTax);
        return userTax;
    }

    public static void calculateTotalCost(double fee, double overage, double userTax) {
        double total = fee + overage + userTax;
        System.out.format("Total: $%.2f\n", total);
    }
}
