public class MyListTest {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.addFirst("1");
        list.addFirst("3");
        list.addFirst("5");
        list.addLast("6");
        System.out.println("Fist"+list.getFirst());
        System.out.println("Last"+list.getLast());

    }
}
