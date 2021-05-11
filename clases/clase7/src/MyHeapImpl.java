public class MyHeapImpl<T extends Comparable<T>> implements MyHeap<T> {

    private T[] values;

    private int size;

    public MyHeapImpl(int size) {
        values = (T[]) new Object[size];
    }

    private int getFatherPosition(int position) {
        return (position - 1) / 2;
    }

    private int getLeftChildPosition(int position) {
        return (2 * position + 1);
    }

    private int getRightChildPosition(int position) {
        return (2 * position + 2);
    }

    @Override
    public void insert(T value) {
        int position = size;
        size++;
        values[position] = value;

        while (position != 0 &&
                values[position].compareTo(values[getFatherPosition(position)]) > 0) {
            values[position] = values[getFatherPosition(position)];
            values[getFatherPosition(position)] = value;

            position = getFatherPosition(position);
        }
    }

    @Override
    public T delete() throws EmptyHeapException {
        T valueToReturn = null;

        if (size == 0) {
            throw new EmptyHeapException();
        }
        valueToReturn = values[0];

        if (size == 1) {
            values[0] = null;
        } else {
            int position = 0;
            values[position] = values[size - 1];

            int childMaxPosition = maxPosition(getLeftChildPosition(position),
                    getRightChildPosition(position));

            // Change if with while with correct condition

            if (values[childMaxPosition].compareTo(values[position]) > 0) {
                // Swap the values[childMaxPosition] con values[position]
            }
        }


        size--;

        return valueToReturn;
    }

    private int maxPosition(int position1, int position2) {
        // Controlar posiciones fueras del arbol
        return 0;
    }

    @Override
    public T get() throws EmptyHeapException {

        if (size == 0) {
            throw new EmptyHeapException();
        }

        return values[0];
    }

    @Override
    public int size() {
        return 0;
    }
}
