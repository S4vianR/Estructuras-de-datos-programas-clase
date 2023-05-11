package arbol;

// Import for JavaOptionPane
import javax.swing.JOptionPane;

public class AppEmpleado {
    public static void main(String[] args) {
        // Variables
        ArbolBinario arbol = new ArbolBinario();
        int opcion = 0, numEmpleado;
        String rfc, nombre;
        Empleado empleado;

        // Do-While
        do {
            String menu = "1. Agregar nodo\n" +
                            "2. Recorrer el arbol en preOrden\n" +
                            "3. Recorrer el arbol inOrden\n" +
                            "4. Recorrer el arbol en postOrden\n" +
                            "5. Buscar un nodo\n" +
                            "6. Eliminar un nodo\n" +
                            "7. Salir\n" +
                            "Opción: ";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu, "Arboles binarios", JOptionPane.QUESTION_MESSAGE));
            switch (opcion){
                case 1:
                    rfc = JOptionPane.showInputDialog(null, "RFC: ", "Captura RFC", JOptionPane.QUESTION_MESSAGE);
                    nombre = JOptionPane.showInputDialog(null, "Nombre: ", "Captura nombre", JOptionPane.QUESTION_MESSAGE);
                    numEmpleado = Integer.parseInt(JOptionPane.showInputDialog(null, "Número de empleado: ", "Captura número de empleado", JOptionPane.QUESTION_MESSAGE));
                    empleado = new Empleado(rfc, nombre, numEmpleado);
                    arbol.insertar(empleado);
                    break;
                case 2:
                    if (!arbol.isEmpty())
                        arbol.preorden();
                    else
                        JOptionPane.showMessageDialog(null, "El árbol está vacío", "Árbol vacío", JOptionPane.ERROR_MESSAGE);
                    break;
                case 3:
                    if (!arbol.isEmpty())
                        arbol.inorden();
                    else
                        JOptionPane.showMessageDialog(null, "El árbol está vacío", "Árbol vacío", JOptionPane.ERROR_MESSAGE);
                    break;
                case 4:
                    if (!arbol.isEmpty())
                        arbol.postorden();
                    else
                        JOptionPane.showMessageDialog(null, "El árbol está vacío", "Árbol vacío", JOptionPane.ERROR_MESSAGE);
                    break;
                case 5:
                    rfc = JOptionPane.showInputDialog(null, "RFC: ", "Buscar un nodo por RFC", JOptionPane.QUESTION_MESSAGE);
                    empleado = new Empleado(rfc, "", 0);
                    if (arbol.buscar(empleado) != null)
                        JOptionPane.showMessageDialog(null, "El empleado con RFC: " + rfc + " sí existe");
                    else
                        JOptionPane.showMessageDialog(null, "El empleado con RFC: " + rfc + " no existe");
                    break;
                case 6:
                    rfc = JOptionPane.showInputDialog(null, "RFC: ", "Eliminar un nodo por RFC", JOptionPane.QUESTION_MESSAGE);
                    empleado = new Empleado(rfc, "", 0);
                    arbol.eliminar(empleado);
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Fin del programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
                    break;
            }
        } while (opcion != 7);
    }
}
