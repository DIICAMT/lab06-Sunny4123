package org.dii.oop.lesson06.exercise02;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name,String width, String height) {
        super(name, "4"); // Rectangle has 4 sides
        this.width = Double.parseDouble(width);
        this.height = Double.parseDouble(height);
    }
    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
