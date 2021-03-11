public class Contact {

    /* Definicion de atributos */

    private String email = null;

    private String name = null;
    
    /* Constructores (en python eran def __init__(self...*/
    public Contact(){
        // no hago nada
    }

    public Contact(String arg_email, String arg_name) {
        this.email = arg_email;
        this.name = arg_name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getName() {
        return this.name;
    }

    public void setEmail(String mail) {
        this.email = mail;
    }
}