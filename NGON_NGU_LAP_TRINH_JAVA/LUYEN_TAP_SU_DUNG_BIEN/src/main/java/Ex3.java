import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ban kinh");
        double r = sc.nextDouble();

        double s = Math.pow(r,2)*3.14;
        double c = r*2*3.14;
        System.out.println("Dien tich HT la: " + s + " "+ "Chu vi HT la: " + c);
    }
}
