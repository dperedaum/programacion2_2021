public class NodeList<S> {

    private S value;

    private NodeList<S> nextValue;

    public NodeList(S value) {
        this.value = value;
        nextValue = null;
    }

    public S getValue() {
        return value;
    }

    public void setValue(S value) {
        this.value = value;
    }

    public NodeList getNextValue() {
        return nextValue;
    }

    public void setNextValue(NodeList nextValue) {
        this.nextValue = nextValue;
    }

    public String toString() {
        return "" + value;
    }
}
