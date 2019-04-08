import java.util.Scanner;

public class Home {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bmi,weidth,height;

        System.out.println("Your weight (in kilogam)");
        weidth = sc.nextDouble();
        System.out.println("Your height (in meter)");
        height = sc.nextDouble();

        bmi =weidth/(height*height);

        System.out.printf("bmi=", " Interpretation");

        if (bmi<18)
            System.out.println(bmi + " \nUnderweight");
        else if (bmi<25.0)
            System.out.println(bmi + " \nNormal");
        else if (bmi < 30.0)
            System.out.println(bmi + " \nOverweight");
        else
            System.out.println(bmi + " \nObese");
    }
}
