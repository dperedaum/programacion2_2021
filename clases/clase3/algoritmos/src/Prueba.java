public class Prueba {

    public int sumaValoresVectorV1(int[] numeros) {
        // Asignacion consume 1 unidad de tiempo
        int resultado = 0;

        // Comparación consume una unidad de tiempo, resalizar una suma consume una unidad de tiempo.
        for (int i = 0; i < numeros.length; i++) {
            resultado = resultado + numeros[i];
        }

        return resultado;
    }

    public int sumaValoresVectorV2(int[] numeros) {
        // Asignacion consume 1 unidad de tiempo
        int resultado = 0;

        // Comparación consume una unidad de tiempo, resalizar una suma consume una unidad de tiempo.
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++) {
                System.out.println("Numero de i " + numeros[j]);
            }
            resultado = resultado + numeros[i];
        }

        return resultado;
    }


    /*
        Función que representa el tiempo de respuesta de mi algoritmo: sumaValoresVectorV1

        T(n) = 1 + (1 + (n + 1) + (n + 1) + 2n) + 1
        T(n) = 4n + 5 eq O(n)

        Función que representa el tiempo de respuesta de mi algoritmo: sumaValoresVectorV2
        T'(n) = 1 + 1 + (n + 1) + (n + 1) + n * ( 1 + (n + 1) + (n + 1)  + n + 2) + 1
        T'(n) = 4 + 2n + n*(3n + 3) = 3n^2 +5n + 4 eq O(n^2)

     */
}
