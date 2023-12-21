package salt.testautouni.javacourse.exercises.fruitMarket;

public class Apple extends Fruit {
    public void removeSeeds() {
        System.out.println("Apple seeds removed.");
    }

    public Apple() {
        setCalories(90);
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is made.");
    }
}
