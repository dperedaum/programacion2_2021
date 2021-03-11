import java.util.ArrayList;

public class Main {

    /* Atributos */

    private Contact[] contacts;

    private int amount = 0; 
    // int - para entero, long - entero largo, float punto flotante y double para punto flotante

    private ArrayList contacts2; // solo se crea para mostrar el uso de ArrayList

    /* Constructores */

    public Main() {
        this.contacts = new Contact[100]; // Vector o array
        this.contacts2 = new ArrayList(); // Lista dinamica
    }

    public int getContactAmount() {
        return this.amount;
    }

    public void addContact(String email, String name) throws ContactAlreadyExists, InvalidInformation {
        // en Pyhton if email is None or name is None:
        // en Java el AND se representa && y el or se representa con ||
        if (email == null || name == null) {
            //en python lanzar raise
            throw new InvalidInformation();
        }

        // 3 secciones, 1 - inicializacion *se ejecuta una sola vez, 
        // 2 - condicion que se evalua en cada iteracion, 
        //3- paso iterativo es un sentencia que se ejecuta al final de la iteracion

        boolean encontre = false;
        for (int i = 0; i < this.amount; i++) {
            // Notar que usamos la operacion equals para comparar instancias en vez de ==
            if (this.contacts[i].getEmail().equals(email)) {
                encontre = true;
            }

        }
    
        // if de una sola linea puedo no colocar las llaves de bloque
        if (encontre) 
            throw new ContactAlreadyExists();

        // Se podria realizar con un while el for anterior de la siguiente forma
        /*
        int j = 0;
        while (j < this.amount) {
            // ... sentencias del bucle
            j++
        }
        */
        // inicializar instancia y agregar a la lista
        Contact tempContact = new Contact(email, name);
        this.contacts[this.amount] = tempContact;
        this.amount++;
    }

    public static void main(String[] args) {

        Main test = new Main();

        System.out.println(test.getContactAmount());

        try {

            test.addContact("dpereda@correo.um.edu.uy", "Daniel");
        
        } catch (ContactAlreadyExists c) {
            System.out.println("Error 1");
        } catch (InvalidInformation e) {
            System.out.println("Error 2");
        }
        
        System.out.println("Paso 2:" + test.getContactAmount());

        // intento agregar nuevamente el contacto con mismo mail

        try {

            test.addContact("dpereda@correo.um.edu.uy", "Daniel");
            System.out.println("Error 3");
        } catch (ContactAlreadyExists c) {
            System.out.println("OK!");
        } catch (InvalidInformation e) {
            System.out.println("Error 2");
        }
    }
}