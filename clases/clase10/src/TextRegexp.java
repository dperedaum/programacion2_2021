public class TextRegexp {

    public static void main(String[] args) {
        String regexp = "^((\"(?:[^\"]|\"\")*\"|[^,]*)(,(\"(?:[^\"]|\"\")*\"|[^,]*))*)$";

        String text = "Hola, mundo";

        String[] partes = text.to(regexp);
        System.out.println("Size = " + partes.length);
        for (String temp : partes) {
            System.out.println(temp);
        }

    }
}
