package org.dii.oop.lesson06.exercise01;
public class Shape {
    private String name;
    private int numSides;

    public Shape(String name, String sides) {
        this.name = name;
        this.numSides = Integer.parseInt(sides);
    }

    public double getArea() {
        return 0;
    }
    public double getPerimeter(){
        return 0;
    }
    public String getName() {
        return name;
    }
    public int getNumSides() {
        return numSides;
    }
}
