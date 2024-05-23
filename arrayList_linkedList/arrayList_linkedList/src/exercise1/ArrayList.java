package exercise1;
import java.util.Arrays;

public class ArrayList<E> {
    public Object[] elements;
    public int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public ArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public ArrayList(int capacity){
        elements = new Object[capacity];
    }

    public int size(){
        return this.size;
    }

    public void add(int index, E element){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("Error index: index = " + index + " size " + size);
        } else {
            if (size == elements.length){
                ensureCapacity(elements.length + 1);
            }
            for (int i = elements.length - 1; i > index; i--) {
                elements[i] = elements[i-1];
            }
            elements[index] = element;
            size++;
        }
    }

    public E remove(int index){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Error index: index =" + index + " size " + size);
        } else {
            E removeObject = (E) elements[index];
            for (int i = index; i < elements.length-1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
            return removeObject;
        }
    }

    public ArrayList<E> clone(){
        ArrayList<E> newArray = new ArrayList<>();
        newArray.elements = Arrays.copyOf(this.elements, this.size);
        newArray.size = this.size;
        return newArray;
    }

    public boolean contains(E o){
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)){
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o){
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(o)){
                index = i;
                break;
            }
        }
        return index;
    }

    public boolean add(E o){
        if (size == elements.length + 1){
            ensureCapacity(elements.length + 1);
        }
        elements[size++] = o;
        return true;
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = this.elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    public E get (int i){
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("Error index: index =" + i + " size " + i);
        }
        return (E) elements[i];
    }

    public void clear(){
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
        size = 0;
    }
}
