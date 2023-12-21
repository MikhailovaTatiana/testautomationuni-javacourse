package salt.testautouni.javacourse.chapter9;

public class Square extends Rectangle2 {

    @Override
    public double calculatePerimeter() {
        return sides * length;
    }

    public void print(String what) {
        System.out.println("I am a " + what);
    }
}
