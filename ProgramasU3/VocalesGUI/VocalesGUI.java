
// Reuben Rhienhart 20112048
import java.util.Stack;
import javax.swing.JOptionPane;

// Verificar si una vocal es par o impar
public class VocalesGUI {

    public static void main(String[] args) {
        int op = 0;
        do {
            String cadena = JOptionPane.showInputDialog("Ingrese la cadena");
            boolean continuar = false;
            do {
                char vocal = JOptionPane.showInputDialog("Ingrese la vocal").charAt(0);
                if (vocal == 'a' || vocal == 'e' || vocal == 'i' || vocal == 'o' || vocal == 'u') {
                    int resultado = verificarVocal(cadena, vocal);
                    if (resultado == 0) {
                        JOptionPane.showMessageDialog(null, "No hay vocales");
                    } else if (resultado == 1) {
                        JOptionPane.showMessageDialog(null, "La vocal es par");
                    } else {
                        JOptionPane.showMessageDialog(null, "La vocal es impar");
                    }
                    continuar = true;
                } else {
                    JOptionPane.showMessageDialog(null, "La vocal no es válida");
                    continuar = false;
                }
            } while (!continuar);
            JOptionPane.showMessageDialog(null, "¿Desea continuar? 1 = Si, 2 = No");
        } while (op != 2);
    }

    public static int verificarVocal(String cadena, char vocal) {
        int resultado = 0;
        int contador = 0;
        Stack<Character> pila = new Stack<Character>();
        /*
         * Explicación de la lógica:
         * Se recorre la cadena y se verifica si el caracter es igual a la vocal
         * Si es igual, se agrega a la pila y se incrementa el contador
         * Si el contador es par, se retorna 1
         * Si el contador es impar, se retorna -1
         * Si el contador es 0, se retorna 0
         */
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == vocal) {
                pila.push(cadena.charAt(i));
                contador++;
            }
        }
        if (contador == 0) {
            resultado = 0;
        } else if (contador % 2 == 0) {
            resultado = 1;
        } else {
            resultado = -1;
        }
        return resultado;
    }
}