public class MyIntegerListImpl implements MyIntegerList{

    private Integer[] list;

    public MyIntegerListImpl(int maxSize) {
        list = new Integer[maxSize];
    }

    @Override
    public void add(int value) {
        // que pasa si llegue al limite de mi array ¿?
        list[size()] = value;
    }

    @Override
    public void delete(int value) {

    }

    @Override
    public int get(int position) {
        return 0;
    }

    @Override
    public int size() {
        int size = 0;
        int i = 0;

        while (i < list.length && list[i] != null) {
            i++;
        }

        size = i + 1;

        return size;
    }
}
