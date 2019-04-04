public class MyListTest {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();

        list.add(0,"asda");
        list.add(1,"t");
        list.add(2,"t2");
        list.addLast("rtrtr");
       // list.remove(4);
        System.out.println("Hien thi " + list.get(0));
        System.out.println("Hien thi " + list.get(3));

        list.clear();
        System.out.println(list.get(0));
    }
}
