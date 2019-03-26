import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so");
        int number = sc.nextInt();
        int count = 0;
        int n = 2;
        while (count < number) {
            int a = 1;
            for (int j = 2; j <= n -1; j++)
                if (n % j == 0) {
                    a = 0;
                    break;
                }
            if (a == 1) {
                System.out.println(" " + n);
                count++;
            }
            n++;
        }
    }
}
