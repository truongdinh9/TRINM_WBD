import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] array;
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhap do dai cua mang");
            size = sc.nextInt();
            if (size > 30){
                System.out.println("Do dai cua mang khong qua 30");
            }
        }while (size > 30);

        array = new int[size];
        int i = 0;
        while (i < array.length){
            System.out.println("Phan tu mang " + (i+1));
            array[i] = sc.nextInt();
            i ++;
        }

        int count =0;
        System.out.print("Danh sach sinh vien do: ");
        for (int j=0; j < array.length;j++){
            System.out.print(array[j] + "\t");
            if (array[j] >=5 && array[j]<=10)
                count++;
        }
        System.out.print("\n Tong so sinh vien do " + count);
    }
}
