import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Moi ban nhap b: ");
        double b = sc.nextDouble();
        System.out.println("Moi ban nhap c: ");
        double c = sc.nextDouble();

        Account ac = new Account(a, b, c);

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            } else {
                System.out.println("Phuong trinh co 1 nghiem, x = " + (-c / b));
            }
        } else {
            if (ac.getDiscriminant() < 0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (ac.getDiscriminant() == 0) {
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + ac.getExperience());
            } else {
                System.out.println("Phuong trinh co 2 nghiem ");
                System.out.println("x1 = " + ac.getRoot1());
                System.out.println("x2 = " + ac.getRoot2());
            }
        }


    }
}
