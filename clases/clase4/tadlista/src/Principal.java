public class Principal {

    public static void main(String[] args) {
        MyList myList = new MyLinkedLIst();/*new MyIntegerListImpl(5);*/

        int temp = 25;

        Integer temp2 = temp; // Long, Float, Boolean, Char

        myList.add(temp);

        myList.add(23);

        myList.add(2);

        myList.add(2);

        myList.add(2);

        myList.add(2);

        if (myList.size() == 6) {
            System.out.println("Ok!");
        } else {
            System.out.println("Error! " + myList.size());
        }

        // Resultado esperado: es tener un lista con los valores: 25, 23,2

        MyList myList2 = new MyLinkedLIst();

        myList2.add("Hola");
        myList2.add("Mundo");

        if (myList2.size() == 2) {
            System.out.println("Ok 2 !");
        } else {
            System.out.println("Error! " + myList.size());
        }

        /*
        Conversión de tipos númericos float a int
        float t = 2.0f;
        int prueba = (int) t;
        */
        String elementPos2 = (String) myList2.get(1);

        if (elementPos2.equals("Mundo")) {
            System.out.println("Ok 3");
        } else {
            System.out.println("Error!");
        }
    }
}
