public class MyLinkedList<T> implements MyList<T> {

    private NodeList<T> first = null;

    private NodeList<T> last = null;

    private int size = 0;

    public void add(T value) {
        NodeList elementToAdd = new NodeList(value);

        size++;
        if (first == null) {
            first = elementToAdd;
            last = first;
        } else {

            last.setNextValue(elementToAdd);
            last = elementToAdd;

        }
    }

    public void delete(T value) {

    }

    public T get(int position) {
        int posActual = 0;
        T element = null;
        NodeList<T> temp = first;

        if (position + 1 <= this.size()) {
            while (posActual < position) {
                temp = temp.getNextValue();
                posActual++;
            }

            element = temp.getValue();

        }

        return element;
    }

    public int size() {
        int count = 0;

        count = size;
        return count;
    }
}
