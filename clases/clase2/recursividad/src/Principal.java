public class Principal {

    public int factorial_iterativo(int valor) {
        int resultado = 1;

        for (int i = valor; i > 0; i--) {
            resultado = resultado * i;
        }

        return resultado;
    }

    public int factorial_recursivo(int valor) {
        int resultado = 1;

        if (valor == 0) {
            resultado = 1;
        } else {
            resultado = valor * factorial_recursivo(valor - 1);
        }

        return resultado;
    }

    public static void main(String[] args) {

        // Factorial de un Numero
        /*
           Factorial 5

           factorial(5) = 5 * factorial(4)
           factorial (4) = 4 * factorial (3)
           factorial(3) = 3 * factorial(2)
           factorial(2) = 2 * 1
           factorial(1) = 1 * factorial(0)
           factorial(0) = 1



         */

        Principal temp = new Principal();

        System.out.println("Factorial de 2 " + temp.factorial_iterativo(2));
        System.out.println("Factorial de 3 " + temp.factorial_iterativo(3));

        // llamadas con recursivo

        System.out.println("Factorial de 2 recursivo" + temp.factorial_recursivo(2));
    }

}
