public class EjemploArrayGenerics<R> {

    private R[] value;

    public EjemploArrayGenerics(R[] value) {
        value = this.value;
    }

    public EjemploArrayGenerics() {
        value = (R[]) new Object[10];
    }

    public static void main(String[] args) {
        EjemploArrayGenerics<String> miLista = new EjemploArrayGenerics<String>();
    }
}
