import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr;
        arr = new int[10];
        System.out.println("");
        int i = 0;
        while (i < 5) {
            System.out.print("Nhap phan tu " + (i + 1) + " : ");
            arr[i] = sc.nextInt();
            i++;
        }
        for (int list : arr) {
            System.out.print(" " + list);
        }
        int x;
        System.out.println("");
        System.out.println("Nhap vi tri can chen ");
        x = sc.nextInt();
        
    }


}
