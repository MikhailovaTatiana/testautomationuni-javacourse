package salt.testautouni.javacourse.chapter11;

public class ShapeTester {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle3(5, 7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
