public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList(10);

        list.add(0,"asda");

        System.out.println("Hien thi " + list.get(0));
    }
}
