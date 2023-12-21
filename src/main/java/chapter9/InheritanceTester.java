package chapter9;

public class InheritanceTester {
    public static void main(String[] args) {
        // Employee employee = new Employee();

        // Rectangle2 rectangle = new Rectangle2();
        // rectangle.print();

        // Square square = new Square();
        // square.print("Square");

        // testSquareOverride();

        Mother mom = new Mother();
        mom.setName("Eliza");
        System.out.println(mom. getName() + " is " + mom.getGender());
    }

    public static void testSquareOverride() {

        Rectangle2 rectangle = new Rectangle2();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(8);
        System.out.println(square.calculatePerimeter());
    }
}
