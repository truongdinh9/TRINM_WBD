import array.ArrayList;

import java.util.Arrays;

public class MyList<E> implements ArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPCITY = 1;
    private E elements[];

    public MyList() {
    }

    public MyList(int capa) {
        capa = DEFAULT_CAPCITY;
        elements = (E[]) new Object[capa];
    }

    private void ensureCapa(int x){
        size = x;
        elements = Arrays.copyOf(elements, size);
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public E clone() {
        return null;
    }

    @Override
    public boolean contains(E o) {
        return false;
    }

    @Override
    public int indexOf(E o) {
        return 0;
    }

    @Override
    public boolean add(E o) {
        return false;
    }

    @Override
    public void ensureCapacity(int minCapacity) {

    }

    @Override
    public E get(int index) {
        return elements[index];
    }

    @Override
    public void clear() {

    }

}
