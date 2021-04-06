public class MyLinkedLIst implements MyList {

    private NodeList first = null;

    private NodeList last = null;

    private int size = 0;

    public void add(Object value) {
        NodeList elementToAdd = new NodeList(value);
        size++;
        if (first == null) {
            first = elementToAdd;
            last = first;
        } else {

            last.setNextValue(elementToAdd);
            last = elementToAdd;

            /*
            Versión no optimizada
            // Busco el ultimo nodo y lo dejo en la variable temp
            NodeList tempUltimo = first;

            while (tempUltimo.getNextValue() != null) {
                tempUltimo = tempUltimo.getNextValue();
            }

            // tempUltimo no es mas el ultimo, y elementToAdd pasa a ser el ultimo elemento de la lista
            tempUltimo.setNextValue(elementToAdd);

             */
        }
    }

    public void delete(Object value) {

    }

    public Object get(int position) {
        return 0;
    }

    public int size() {
        int count = 0;

        count = size;
        /*
        Version no optimizada
        NodeList temp = first;

        while (temp != null) {
            temp = temp.getNextValue();
            count++;
        }
        */
        return count;
    }
}
