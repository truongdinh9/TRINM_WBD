import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(3.5);
        System.out.println(circle);

        double perce1 = Math.random()*100 + 1;
        circle.resize(perce1);

        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle);

        double perce2 = Math.random()*100 + 1;
        rectangle.resize(perce2);
    }
}
