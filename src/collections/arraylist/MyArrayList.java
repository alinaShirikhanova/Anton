package collections.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class MyArrayList <E> {
    private Object[] elements;
    private int size;


    // Начальный размер массива
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
//        if (size > 0) {
//            return false;
//        }
//        return true;
        return size == 0;
    }
    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(String.format("Index %d out of bounds for length %d", index, size));
        }
    }
    @SuppressWarnings("unchecked")
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    public boolean add(E elem) {
        elements[size] = elem;
        return true;
    }






}
