package salt.testautouni.javacourse.exercises.fruitMarket;

public class Market {
    public static void main(String[] args) {
        Fruit yellowFruit = new Apple();
        ((Apple) yellowFruit).removeSeeds();
        yellowFruit.makeJuice();
        System.out.println(yellowFruit.getCalories() + " calories");

        System.out.println("===============");

        yellowFruit = new Banana();
        ((Banana) yellowFruit).peel();
        yellowFruit.makeJuice();
        System.out.println(yellowFruit.getCalories() + " calories");

        System.out.println("===============");

        Apple apple = new Apple();
        muss(apple);
        Banana banana = new Banana();
        muss(banana);
    }

    public static void muss(Fruit fruit) {
        System.out.println("Zhuuu");
        fruit.makeJuice();
    }
}
