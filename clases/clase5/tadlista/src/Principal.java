public class Principal {

    public static void main(String[] args) {
        MyList myList = new MyLinkedList();/*new MyIntegerListImpl(5);*/

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

        MyList myList2 = new MyLinkedList();

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

        // Opcion 1 - Mejor

        MyStack myStack = new MyLinkedList();

        myStack.push("Hola");
        myStack.push("Mundo");

        // Opcion 2

        MyLinkedList myStack2 = new MyLinkedList();

        myStack2.push("Hola");
        myStack2.push("Mundo");

        myStack2.delete("Hola");

        // Ejemplo de postifjo (uso de stack)

        int a = 10 + 5 * 3; // Interpretación

        int b = (10 + 5) * 3;
        int c = 10 + (5 * 3);

        // A = C , A != B, B != C

        //int ejemplo_pos_fija = 10 3 *; eq 10 * 3

        // int a_pos_fija = 10 5 3 * +

        // Algoritmo de evaluación
        /*

        MyStack stack = new MyLinkedList();
        stack.push(10);
        stack.push(5);
        stack.push(3);

        int op1 = stack.pop();
        int op2 = stack.pop();

        stack.push(op2 * op1);

        op1 = stack.pop(); // aca esta el resultado de 5 * 3
        op2 = stack.pop(); // aca esta el valor 10

        stack.push(op2 + op1);
         */


        // Ejemplo de queue

        MyQueue queue = new MyLinkedList();

        queue.enqueue("Daniel");
        queue.enqueue("Eduardo");
        queue.enqueue("Jose");

        System.out.println(queue.dequeue()); // El resultado es : Daniel
    }
}
