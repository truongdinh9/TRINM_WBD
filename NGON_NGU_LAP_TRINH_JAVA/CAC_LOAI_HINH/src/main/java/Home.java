public class Home {
    public static void main(String[] args) {
        int i, j, l, m, h, t;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (l = 1; l <= 5; l++) {
            for (m = 1; m < l; m++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (h = 4; h >= 1; h--) {
            for (t = 1; t <= h; t++) {
                System.out.print(" * ");
            }
            System.out.println("");
        }
    }
}
