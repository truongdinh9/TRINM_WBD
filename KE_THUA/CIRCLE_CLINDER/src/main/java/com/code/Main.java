package com.code;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.5, "Red");
        System.out.println(circle);
        Cylinder cylinder = new Cylinder(3.5, "blue", 1.52);
        System.out.println(cylinder);
    }
}
