import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array;
        int size;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap do dai cua mang");
            size = sc.nextInt();
            if (size > 10) {
                System.out.println("Do dai cua mang toi da co 10");
            }
        } while (size > 10);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Phan tu cua mang " + (i + 1));
            array[i] = sc.nextInt();
            i++;
        }

        int minValue = array[0];

        for (i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];

            }
        }
        System.out.println("Gia tri nho nhat cua mang la: " + minValue);
    }
}
