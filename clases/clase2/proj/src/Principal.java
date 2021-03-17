import entidades.Animal;
import interfaces.GastoAnimal;

public class Principal {

    public long calcularGastoTotal(GastoAnimal[] gastosAnimal) {
        long totalGastos = 0;

        for (int i = 0; i < gastosAnimal.length; i++) {

            totalGastos += gastosAnimal[i].obtenerGastoAlimentacionAnual();

        }

        return totalGastos;
    }


    public static void main(String[] args) {

        Animal[] vecAnimal = new Animal[1];

        vecAnimal[0] = new Animal("Perro", 1000);

        Principal main = new Principal();

        long total = main.calcularGastoTotal(vecAnimal);

        System.out.println("Resultado " + total);
    }

}
