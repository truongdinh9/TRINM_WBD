import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Circle [] circles = new Circle[3];
        circles[0] = new Circle(1.2);
        circles[1] = new Circle();
        circles[2] = new Circle(1.1,"red");

        System.out.println("Before");

        for (Circle circle : circles){
            System.out.println(circle);
        }

        Arrays.sort(circles);

        System.out.println("After");
        for (Circle circle : circles){
            System.out.println(circle);
        }

    }
}
