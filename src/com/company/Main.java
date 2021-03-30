package com.company;

public class Main {

    public static void main(String[] args) {
        Rectangle.printClassName(true);

        System.out.println();

        Rectangle r1 = new Rectangle(3);
        r1.printArea();
        r1.printRectangleKind();

        System.out.println();

        Rectangle r2 = new Rectangle(2, 4);
        r2.printArea();
        r2.printRectangleKind();

        System.out.println();

        Rectangle r3 = new Rectangle(5, 3);
        r3.printArea();
        r3.printRectangleKind();
        System.out.println("Равны ли прямоугольники: " + r3.isTheSameRectangle(r2));

        System.out.println();

        Rectangle.printRectanglesCount();
    }
}