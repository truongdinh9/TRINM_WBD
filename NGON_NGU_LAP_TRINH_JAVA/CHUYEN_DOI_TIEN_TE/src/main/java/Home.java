import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap tien DOLA: ");
        int dola = sc.nextInt();
        int tong = dola * 23000;
        System.out.println("Tien dola sang viet la: " + tong);
    }
}
