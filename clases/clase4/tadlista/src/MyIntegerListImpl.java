public class MyIntegerListImpl implements MyList {

    private Integer[] list;
    private int size = 0;

    public MyIntegerListImpl(int initialSize) {
        list = new Integer[initialSize];
    }

    @Override
    public void add(Object value) {
      /*  // que pasa si llegue al limite de mi array ¿?
        if (size == list.length){
            Integer[] temp = new Integer[list.length*2];

            for (int i = 0; i < list.length; i++) {
                temp[i] = list[i];
            }

            list = temp;
        }

        list[size] = value;
        size++;*/
    }

    @Override
    public void delete(Object value) {
        // Borrar todas las ocurrencias.
        // EJ {1, 4, 5, 1, 2} , delete(1), resultado esperado {4, 5, 2, null, null}
    }

    @Override
    public Object get(int position) {

        return list[position];
    }

    @Override
    public int size() {
        return size;
    }
}
