public class NodeList {

    private Object value;

    private NodeList nextValue;

    public NodeList(Object value) {
        this.value = value;
        nextValue = null;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
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
