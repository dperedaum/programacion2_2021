public class MyClosedHashImpl<K, V> implements MyHash<K, V> {

    private static final int DEFAULT_INITIAL_TABLE_HASH_SIZE = 10;

    private ClosedHashNode[] tableHash;

    public MyClosedHashImpl() {
        tableHash = new ClosedHashNode[DEFAULT_INITIAL_TABLE_HASH_SIZE];
    }

    public MyClosedHashImpl(int tableHashSize, float loadFactor) {
        tableHash = new ClosedHashNode[tableHashSize];
    }

    @Override
    public void put(K key, V value) {
        int positionInHashTable = key.hashCode() % tableHash.length;

        // FIXME Continuar
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public void delete(K key) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(K key) {
        return false;
    }
}
