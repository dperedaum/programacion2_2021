public class Principal {

    public static void main(String[] args) {
        MyIntegerList myList = new MyIntegerListImpl(5);

        myList.add(25);

        myList.add(23);

        myList.add(2);

        if (myList.size() == 3) {
            System.out.println("Ok!");
        } else {
            System.out.println("Error! " + myList.size());
        }

        // Resultado esperado: es tener un lista con los valores: 25, 23,2
    }
}
