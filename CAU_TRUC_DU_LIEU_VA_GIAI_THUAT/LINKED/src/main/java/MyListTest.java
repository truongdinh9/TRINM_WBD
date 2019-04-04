public class MyListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addFirst("1");
        list.addLast("6");

        System.out.println("Fist" + list.getFirst());
        System.out.println("Last" + list.getLast());
        list.add(1, "1");
        list.add(2, "2");
        list.add(3, "3");
        list.add(4, "4");
        System.out.println(list.get(0));

      //  System.out.println("adas" + list);


    }
}
