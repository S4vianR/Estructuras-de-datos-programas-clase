package OrdenamientoMezclaDirecta;

// Import para el JOptionPane
import javax.swing.JOptionPane;

public class MezclaDirecta {
    public static void main(String[] args) {
        // Arreglo de numeros desordenados
        int[] a = { 5, 3, 2, 1, 4 };
        // Variable para el tamaño del arreglo
        int n = a.length;
        // Se imprime el arreglo desordenado
        JOptionPane.showMessageDialog(null, "Arreglo desordenado: " + imprimirArreglo(a));
        // Se ordena el arreglo
        mezclaDirecta(a, n);
        // Se imprime el arreglo ordenado
        JOptionPane.showMessageDialog(null, "Arreglo ordenado: " + imprimirArreglo(a));
    }

    // Metodo de ordenamiento por mezcla directa
    public static void mezclaDirecta(int[] a, int n) {
        // Variables
        int i, j, k;
        // Condicion para ordenar el arreglo
        if (n > 1) {
            int n1 = n / 2;
            int n2 = n - n1;
            int[] b = new int[n1];
            int[] c = new int[n2];
            for (i = 0; i < n1; i++) {
                b[i] = a[i];
            }
            for (i = 0; i < n2; i++) {
                c[i] = a[i + n1];
            }
            // Recursividad del metodo
            mezclaDirecta(b, n1);
            mezclaDirecta(c, n2);
            // Mezcla de los subarreglos b y c en a
            i = 0;
            j = 0;
            k = 0;
            // Mientras que el tamaño de b y c sea diferente de j y k respectivamente se
            // ejecutara el ciclo while
            while (b.length != j && c.length != k) {
                // Condicion para ordenar el arreglo
                if (b[j] < c[k]) {
                    // Se ordena el arreglo a con los valores de b y c
                    a[i] = b[j];
                    i++;
                    j++;
                } else {
                    // Se ordena el arreglo a con los valores de b y c
                    a[i] = c[k];
                    i++;
                    k++;
                }
            }
            // Mientras que el tamaño de b sea diferente de j se ejecutara el ciclo while
            while (b.length != j) {
                // Se ordena el arreglo a con los valores de b y c
                a[i] = b[j];
                i++;
                j++;
            }
            // Mientras que el tamaño de c sea diferente de k se ejecutara el ciclo while
            while (c.length != k) {
                // Se ordena el arreglo a con los valores de b y c
                a[i] = c[k];
                i++;
                k++;
            }
        }
    }

    // Metodo para imprimir el arreglo
    public static String imprimirArreglo(int[] a) {
        // Variable para el arreglo
        String arreglo = "";
        // Ciclo for para recorrer el arreglo
        for (int i = 0; i < a.length; i++) {
            // Se concatena el arreglo
            arreglo += a[i] + " ";
        }
        // Se retorna el arreglo
        return arreglo;
    }
}