import java.util.Scanner;

public class Home {
    public String one_to_hund(int n) {
        String str = "";
        while (n != 0) {
            if (n == 1) {
                str = str + "one";
                n = 0;
            } else if (n == 2) {
                str = str + "two";
                n = 0;
            } else if (n == 3) {
                str = str + "three";
                n = 0;
            } else if (n == 4) {
                str = str + "four";
                n = 0;
            } else if (n == 5) {
                str = str + "five";
                n = 0;
            } else if (n == 6) {
                str = str + "six";
                n = 0;
            } else if (n == 7) {
                str = str + "seven";
                n = 0;
            } else if (n == 8) {
                str = str + "eight";
                n = 0;
            } else if (n == 9) {
                str = str + "nice";
                n = 0;
            } else if (n == 10) {
                str = str + "ten";
                n = 0;
            } else if (n == 10) {
                str = str + "ten";
                n = 0;
            } else if (n == 11) {
                str = str + "eleven";
                n = 0;
            } else if (n == 12) {
                str = str + "twelve";
                n = 0;
            } else if (n == 13) {
                str = str + "thirteen";
                n = 0;
            } else if (n == 14) {
                str = str + "fourteen";
                n = 0;
            } else if (n == 15) {
                str = str + "fitten";
                n = 0;
            } else if (n == 16) {
                str = str + "sixten";
                n = 0;
            } else if (n == 17) {
                str = str + "seventen";
                n = 0;
            } else if (n == 18) {
                str = str + "eightten";
                n = 0;
            } else if (n == 19) {
                str = str + "nineten";
                n = 0;
            } else if (n >= 20 && n < 30) {
                str = str + "tweenty";
                n = n - 20;
            } else if (n >= 30 && n < 40) {
                str = str + "thirty";
                n = n - 30;
            } else if (n >= 40 && n < 50) {
                str = str + "fourty";
                n = n - 40;
            } else if (n >= 50 && n < 60) {
                str = str + "fitty";
                n = n - 50;
            } else if (n >= 60 && n < 70) {
                str = str + "seventy";
                n = n - 60;
            } else if (n >= 70 && n < 80) {
                str = str + "seventy";
                n = n - 70;
            } else if (n >= 80 && n < 90) {
                str = str + "eightty";
                n = n - 80;
            } else if (n >= 90 && n < 100) {
                str = str + "ninty";
                n = n - 90;
            }
        }
        return str;
    }

    public String convert(int n) {
        String str = "";
        while (n != 0) {
            if (n >= 1 && n < 100) {
                str = str + one_to_hund(n);
                n = 0;
            } else if (n >= 100 && n < 1000) {
                str = str + one_to_hund(n / 100);
                str = str + "hundred";
                n = n % 100;
            } else if (n >= 1000 && n < 10000) {
                str = str + one_to_hund(n / 1000);
                str = str + "Thousanf";
                n = n % 1000;
            }
        }
        return (str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        int n;
        Home home = new Home();

        System.out.println("Enter any number");
        n = sc.nextInt();
        str = home.convert(n);
        System.out.println(str);
    }
}
