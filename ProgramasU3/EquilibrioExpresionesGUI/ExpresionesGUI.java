import java.util.Stack;
import javax.swing.JOptionPane;

// Clase que verifica si una cadena de parentesis esta balanceada
public class ExpresionesGUI {
    public static boolean verifica(String cadena) {
        Stack<String> pila = new Stack();
        /*
         * Explicacion de la logica: Si encuentra un parentesis abierto lo mete a la
         * pila
         * Si encuentra un parentesis cerrado y la pila no esta vacia, saca un elemento
         * Si encuentra un parentesis cerrado y la pila esta vacia, mete un parentesis
         * cerrado y sale del ciclo
         * Si la pila esta vacia, la cadena esta balanceada
         * Si la pila no esta vacia, la cadena no esta balanceada
         */
        int i = 0;
        while (i < cadena.length()) {
            if (cadena.charAt(i) == '(')
                pila.push("(");
            else if (cadena.charAt(i) == ')')
                if (!pila.empty())
                    pila.pop();
                else {
                    pila.push(")");
                    break;
                }
            i++;
        }
        if (pila.empty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int opcion = 0;
        JOptionPane.showMessageDialog(null, "Bienvenido al programa que verifica si una cadena de parentesis esta balanceada");
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("1. Verificar cadena\n2. Salir"));
            switch (opcion) {
                case 1:
                    String cadena = JOptionPane.showInputDialog("Ingrese la cadena a verificar");
                    if (verifica(cadena))
                        JOptionPane.showMessageDialog(null, "La cadena esta balanceada");
                    else
                        JOptionPane.showMessageDialog(null, "La cadena no esta balanceada");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Gracias por usar el programa");
                    break;
                default:
            }
        } while (opcion != 2);
    }
}