package linked;

public interface LinkedList<E> {
    void add(int index, E element);

    void addFirst(E e);

    void addLast(E e);

    E getFirst();

    E getLast();

    E get(int index);

    E remove(int index);
}
