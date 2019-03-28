package vn.com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter widht: ");
        double width = sc.nextDouble();
        System.out.println("Enter height");
        double height = sc.nextDouble();

        Rectangle rec = new Rectangle(width,height);

        System.out.println("Your Rectangle \n"+ rec.display());
        System.out.println("Perimeter of the Rectangle: "+ rec.getPerimeter());
        System.out.println("Area of the Rectangle: "+ rec.getArea());
    }
}
