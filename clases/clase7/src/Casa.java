public class Casa {

    private int numeroPuerta;

    private String direccion;

    public Casa(int numeroPuerta, String direccion) {
        this.numeroPuerta = numeroPuerta;
        this.direccion = direccion;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public void setNumeroPuerta(int numeroPuerta) {
        this.numeroPuerta = numeroPuerta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String toString() {
        return "Hola " + numeroPuerta;
    }

    public boolean equals(Object o) {
        boolean equals = false;

        if (o instanceof Casa) {
            Casa temp = (Casa) o;

            equals = (temp.getNumeroPuerta() == this.getNumeroPuerta()) &&
                    (temp.getDireccion().equals(this.getDireccion()));
        }

        return equals;
    }
}
