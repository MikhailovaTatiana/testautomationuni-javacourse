package salt.testautouni.javacourse.exercises.fruitMarket;

public class Banana extends Fruit {
    public void peel() {
        System.out.println("Banana has been peeled.");
    }

    public Banana() {
        setCalories(120);
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana smoothie is made.");
    }
}
