import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b, c;
        System.out.println("Nhap a: ");
        a = sc.nextFloat();
        System.out.println("Nhap b: ");
        b = sc.nextFloat();
        System.out.println("Nhap c: ");
        c = sc.nextFloat();


        float delta = b * b - 4 * a * c;
        float x1 = (-b + delta) / (2*a);
        float x2 = (-b - delta) / (2*a);

        if (delta < 0) {
            System.out.println("pt vo nghiem");
        } else  if (delta == 0) {
            System.out.println("PT nghiem kep x=" + -b / (2 * a));
        } else {
            System.out.println("pt co 2 nghiem pb: ");
            System.out.println("x1= " + x1);
            System.out.println("x2= " + x2);
        }
    }
}
