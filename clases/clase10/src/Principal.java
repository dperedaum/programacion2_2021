import java.util.ArrayList;

public class Principal {

    public void pepe() {
        Principal.sumar(12, 23);
    }

    public static int sumar(int valor1, int valor2) {
        return valor1 + valor2;
    }
    
    public static void main(String[] args) {
        ArrayList<String> valores = new ArrayList<>();
        int i = 0;

        long begin = System.currentTimeMillis();

        while(true) {

            String hola = "Hola";

            valores.add(hola);

            hola = null;

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
            if (i == 1000) {
                i = 0;
                System.out.println("Se agregaron holas");
            }

        }

        //long end = System.currentTimeMillis();

        //System.out.println("Duración : " + (end - begin));
    }
}
