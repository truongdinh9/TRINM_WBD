import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem mon vat ly");
        double vatly = sc.nextDouble();
        System.out.println("Nhap dien mon hoa hoc");
        double hoahoc = sc.nextDouble();
        System.out.println("Nhap diem  mon van");
        double van = sc.nextDouble();

        double tong =(vatly+ hoahoc + van)/3;

        System.out.println("Diem trung binh 3 mon la: " + tong);
    }
}
