package uy.edu.um.adt.linkedlist;

import java.util.Iterator;

public class MyListIterator<T> implements Iterator<T> {

    private Node<T> data;

    public MyListIterator(Node<T> first) {
        data = first;
    }

    @Override
    public boolean hasNext() {
        return data != null;
    }

    @Override
    public T next() {
        T value = data.getValue();

        data = data.getNext();

        return value;
    }
}
