package array;

public interface ArrayList<E> {

    public void add(int index, E element) ;


    public E remove(int index);

    public int size();


    public E clone();


    public boolean contains(E o);


    public int indexOf(E o);


    public boolean add(E e);


    public void ensureCapacity(int minCapacity);


    public E get(int index);


    public void clear();
}
