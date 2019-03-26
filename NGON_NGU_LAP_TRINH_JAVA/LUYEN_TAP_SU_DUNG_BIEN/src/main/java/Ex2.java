import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap do C");
        int c = sc.nextInt();
        double tong = (c *1.8 )+32;
        System.out.println("Do F la: " + tong);
    }
}
