public class Principal {

    public static MyList<Integer> getPairNumbers(MyList<Integer> numbers) {
        MyList toReturn = new MyLinkedList();

        for(int i = 0; i < numbers.size(); i++) {
            Integer value = numbers.get(i);

            if (value % 2 == 0) {
                toReturn.add(value);
            }
        }

        return toReturn;
    }

    public static void main(String[] args) {
        MyList<Integer> myList = new MyLinkedList();

        myList.add(11);
        myList.add(22);
        myList.add(5);
        myList.add(6);

        // Sumar numeros pares

        MyList<Integer> temporal = Principal.getPairNumbers(myList);

        int resultado = 0;

        for(int i = 0; i < temporal.size(); i++) {
            resultado += temporal.get(i);
        }

        System.out.println("El resultado de la suma de los numeros pares es " + resultado);

    }
}
