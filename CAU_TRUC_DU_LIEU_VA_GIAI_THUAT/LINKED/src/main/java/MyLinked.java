import java.util.LinkedList;

public class MyLinked<E> extends LinkedList<E> {
    private Node head;
    private  int numNodes;

    public MyLinked() {
    }

    @Override
    public void add(int index, E element) {
        super.add(index, element);
    }

    @Override
    public void addFirst(E e) {
        super.addFirst(e);
    }

    @Override
    public void addLast(E e) {
        super.addLast(e);
    }

    @Override
    public E remove(int index) {
        return super.remove(index);
    }

    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public E clone() {
        return null;
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public int indexOf(Object o) {
        return super.indexOf(o);
    }

    @Override
    public boolean add(E e) {
        return super.add(e);
    }
    public void ensureCapacity( int minCapacity){

    }

    @Override
    public E get(int index) {
        return super.get(index);
    }

    @Override
    public E getFirst() {
        return super.getFirst();
    }

    @Override
    public E getLast() {
        return super.getLast();
    }

    @Override
    public void clear() {
        super.clear();
    }
}
