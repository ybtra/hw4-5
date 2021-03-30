package com.company;

public class Rectangle {
    private double x;
    private double y;
    private  double area;
    private static int createdRectangles;
    private final static String RUSSIAN_CLASS_NAME = "Прямоугольник";
    private final static String ENGLISH_CLASS_NAME = "Rectangle";

    public  Rectangle(double x, double y){
        this.x = x;
        this.y = y;
        createdRectangles++;
    }

    public Rectangle(double x){
        this.x = x;
        this.y = x;
        createdRectangles++;
    }

    public double calculateArea(){
        area = x * y;
        return area;
    }

    public void printArea(){
        System.out.println("Area = " + calculateArea());
    }

    public void printRectangleKind(){
        if(x == y){
            System.out.println("Это квадрат");
        }
        else{
            System.out.println("Это прямоугольник");
        }
    }

    public boolean isTheSameRectangle(Rectangle r) {
        if (r.y == y & r.x == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void printRectanglesCount(){
        System.out.println("Всего было создано " + createdRectangles + " прямоугольников");
    }

    public static void printClassName(boolean printRussian){
        if(printRussian == true){
            System.out.println(RUSSIAN_CLASS_NAME);
        }
        else{
            System.out.println(ENGLISH_CLASS_NAME);
        }
    }
}