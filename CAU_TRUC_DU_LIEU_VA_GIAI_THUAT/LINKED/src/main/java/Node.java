public class Node {
    private Node next;
    private Object data;

    public Node(Node next) {
        this.next = next;
    }

    public Object getData() {
        return data;
    }
}
