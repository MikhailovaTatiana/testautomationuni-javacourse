package salt.testautouni.javacourse.exercises;

import java.util.Scanner;

public class PhoneBillCalculator2 {

    static Scanner scan = new Scanner(System.in);
    static double tax = 0.15;
    static double costForExtraMin = 0.25;

    public static void main(String[] args) {

        PhoneBillCalculator2 phoneBillCalculator2 = new PhoneBillCalculator2();

        PhoneBill phoneBill0 = new PhoneBill();
        PhoneBill phoneBill1 = new PhoneBill(1234);
        PhoneBill phoneBill2 = new PhoneBill(1235, 82.45, 500, 509);

        phoneBillCalculator2.printBill(phoneBill0);
        phoneBillCalculator2.printBill(phoneBill1);
        phoneBillCalculator2.printBill(phoneBill2);

        scan.close();
    }

    public double getOverage(int minutes) {
        return costForExtraMin * minutes;
    }

    public double getTax(double baseCost, double overage) {
        return (baseCost + overage) * tax;
    }

    public double getTotalCost(double baseCost, double overage, double userTax) {
        return baseCost + overage + userTax;
    }

    public void printBill(PhoneBill phoneBill) {
        double cost = phoneBill.getBaseCost();
        System.out.format("Phone Bill Statement\nPlan: $%.2f\n", cost);

        int overMin = 0;
        if (phoneBill.getUsedMinutes() > phoneBill.getAllottedMinutes()) {
            overMin = phoneBill.getUsedMinutes() - phoneBill.getAllottedMinutes();
        }
        double overage = getOverage(overMin);
        System.out.format("Overage: $%.2f\n", overage);

        double tax = getTax(cost, overage);
        System.out.format("Tax: $%.2f\n", tax);

        double total = getTotalCost(cost, overage, tax);
        System.out.format("Total: $%.2f\n", total);
    }
}
