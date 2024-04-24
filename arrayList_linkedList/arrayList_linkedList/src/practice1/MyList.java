package practice1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAUL_CAPACITY = 10;
    private Object element[];

    public MyList() {
        element = new Object[DEFAUL_CAPACITY];
    }

    private void ensureCAPA(){
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(E e){
        if(size == element.length){
            ensureCAPA();
        }
        element[size++] = e;
    }

    public E get(int i){
        if( i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + ", size" + i);
        }
        return (E) element[i];
    }
}
