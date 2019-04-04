import linked.LinkedList;

public class MyLinkedList<E> implements LinkedList<E> {
    private Node head;
    private int numNodes;
    private  int size = 0;
    private Node tail;
    public int getSize() {
        return size;
    }

    public MyLinkedList() {
    }
    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
    @Override
    public void add(int index, E element) {

    }

    @Override
    public void addFirst(E e) {
       Node newNode = new Node(e);
       newNode.next = head;
       head = newNode;
       size++;
       if (tail == null){
           tail = head;
       }
    }

    @Override
    public void addLast(E e) {
        Node newNode = new Node(e);
        if (tail == null){
            head = tail = newNode;
        }else {
            tail.next = newNode;
            tail = tail.next;
        }
        size ++;
    }

    @Override
    public E getFirst() {
        return (E) head.getData();
    }

    @Override
    public E getLast() {
        return (E) tail.getData();
    }

    


}
