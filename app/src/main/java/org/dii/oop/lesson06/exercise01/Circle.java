package org.dii.oop.lesson06.exercise01;

public class Circle extends Shape{
    private double radius;
    public Circle(String name,String radius) {
        super(name, "0"); // Circle has 0 sides
        this.radius = Double.parseDouble(radius);
    }
    public double getArea() {
        return 3.14 * (radius * radius);
    }
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
}

