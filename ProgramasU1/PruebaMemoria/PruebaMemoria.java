import javax.swing.text.html.HTML;

// Reuben Rhienhart 20112048
public class PruebaMemoria {
    public static void prueba(int valor) {
        int c = 3;
        String nom = new String();
        System.out.print("Stack: " + System.identityHashCode(c));
        System.out.println("\tHeap: " + System.identityHashCode(nom));
        if (valor <= 0)
            return;
        prueba(valor - 1);
    }

    public static void main(String[] a) {
        prueba(10);
    }
}
