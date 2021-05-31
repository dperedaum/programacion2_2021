public interface MyHash<K, V> {

    void put(K key, V value);

    V get(K key);

    void delete(K key);

    int size();

    boolean contains(K key);
}
