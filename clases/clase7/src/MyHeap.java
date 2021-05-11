public interface MyHeap<T extends Comparable<T>> {

    void insert(T value);

    T delete() throws EmptyHeapException;

    T get() throws EmptyHeapException;

    int size();
}
