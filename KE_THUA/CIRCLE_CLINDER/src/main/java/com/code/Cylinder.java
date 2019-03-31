package com.code;

public class Cylinder extends Circle {
    private double hight;

    public Cylinder() {
    }

    public Cylinder(double hight) {
        this.hight = hight;
    }

    public Cylinder(double r, String color, double hight) {
        super(r, color);
        this.hight = hight;
    }

    public double getHight() {
        return hight;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "hight=" + hight + "and Cirle" + super.toString() +
                '}';
    }
}
