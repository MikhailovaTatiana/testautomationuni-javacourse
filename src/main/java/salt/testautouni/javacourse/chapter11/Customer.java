package salt.testautouni.javacourse.chapter11;

public class Customer {
    public static void main(String[] args) {
        Product book = new Book();
        book.setPrice(9.99);
        System.out.println(book.getBarcode());
    }
}
