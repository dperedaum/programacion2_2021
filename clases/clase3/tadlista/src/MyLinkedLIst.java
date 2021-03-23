public class MyLinkedLIst implements MyIntegerList {

    private NodeList first;

    public void add(int value) {
        if (first == null) {
            NodeList temp = new NodeList(value);

            first = temp;
        } else {
            //
        }
    }

    public void delete(int value) {

    }

    public int get(int position) {
        return 0;
    }

    public int size() {
        return 0;
    }
}
