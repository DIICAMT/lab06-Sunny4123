package org.dii.oop.lesson06.exercise02;

import java.util.ArrayList;

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
class CustomArrayList extends ArrayList<Shape> {
    public void listAllShapes(){
        for (Shape shape : this){
            System.out.println("Name: " + shape.getName() + "Number of side " + shape.getNumSides() + "Area: " + shape.getArea());
        }
    }
    public void sumArea(){
        double result = 0;
        for(Shape shape : this){
            result += shape.getArea();
        }
        System.out.println("Summation of area is: " + result);
    }
}

