import array.ArrayList;

import java.util.Arrays;

public class MyList<E> implements ArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPCITY = 10;
    private E elements[];

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPCITY];
    }

    private void ensureCapa(int x){
        size = x;
        elements = Arrays.copyOf(elements, size);
    }

    @Override
    public void add(int index, E element) {
           for(int i =size -1;i>= index;i--){
               elements[i+1] = elements[i];
           }
           elements[index] = element;
           size++;
    }
    public void addLast(E element){
        elements[size] = element;
    }
    @Override
    public E remove(int index) {
        if (index >=0 && index<=size){
            for (int i = index; i <= size-1; i++) {
                elements[i] = elements[i + 1];
            }
        }else {
            System.out.println("warning");
        }
        size--;
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E clone() {
        return null;
    }

    @Override
    public boolean contains(E o) {
        for (int i =0;i<size;i++){
            if (o.equals(elements[i]))return true;

        }
        return false;
    }

    @Override
    public int indexOf(E o) {
        for (int i=0 ;i<size;i++){
            if (o.equals(elements[i]))return  i;
        }
        return -1;
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
        elements = (E[]) new Object[DEFAULT_CAPCITY];
        size = 0;
    }


}
