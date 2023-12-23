package salt.testautouni.javacourse.exercises;

public class DividingByZero {
    public static void main(String[] args) {
        try {
            int c = 30 / 0;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Error! Dividing by zero is not permitted.");
        } finally {
            System.out.println("Division is fun!");
        }
    }
}
