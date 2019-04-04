public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add(0,"asda");

        list.add(1,"qw");

        System.out.println("Hien thi " + list.get(0));
    }
}
