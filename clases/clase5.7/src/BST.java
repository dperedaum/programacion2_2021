public interface BST<T extends Comparable<T> >{

    void insert(T value);

    void delete(T value);

    boolean exists(T value);

    int size();
}
