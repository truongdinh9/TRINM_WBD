import linked.LinkedList;

public class MyLinkedList<E> implements LinkedList<E> {
    private Node head;
    private int numNodes;
    private int size = 0;
    private Node tail;

    public MyLinkedList() {
    }

    public int getSize() {
        return size;
    }

    @Override
    public void add(int index, E element) {
        if (index < 0) {
            addFirst(element);
        } else if (index > size) {
            addLast(element);
        } else {
            Node current = head;
            for (int i = 1; i < index - 1; i++) {
                current = current.next;
            }
            Node temp = current.next;
            current.next = new Node(element);
            (current.next).next = temp;
            size++;
        }
    }

    @Override
    public void addFirst(E e) {
        Node newNode = new Node(e);
        newNode.next = head;
        head = newNode;
        size++;
        if (tail == null) {
            tail = head;
        }
    }

    @Override
    public void addLast(E e) {
        Node newNode = new Node(e);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
        size++;
    }

    @Override
    public E getFirst() {
        return (E) head.getData();
    }

    @Override
    public E getLast() {
        return (E) tail.getData();
    }

    @Override
    public E get(int index) {
        if (index < 1  )
            return  null;
        if (index > size)
            return  null;
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }

    @Override
    public E remove(int index) {
        return  null;
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


}
