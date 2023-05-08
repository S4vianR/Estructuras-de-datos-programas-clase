package Arbol;

// Import for JOptionPane
import javax.swing.JOptionPane;

public class AppArbol {
    public static void main(String[] args) {
        // Variables
        ArbolBinario arbol = new ArbolBinario();
        int opcion = 0;
        Object elemento;

        // Menu
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un nodo\n2. Recorrer el arbol en preorden\n3. Recorrer el arbol en inorden\n4. Recorrer el arbol en postorden\n5. Dibujar arbol\n6. Salir\n\nElige una opcion",
                        "Arbol Binario", JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {
                    case 1:
                    
                        elemento = JOptionPane.showInputDialog(null, "Ingresa el dato del nodo",
                                "Agregando Nodo", JOptionPane.QUESTION_MESSAGE);
                        arbol.agregarNodo(elemento);
                        break;
                    case 2:
                        // Medoto impimirPreOrden
                        if (!arbol.isEmpty()) {
                            arbol.imprimirPreOrden();
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
                        }
                        break;
                    case 3:
                        if (!arbol.isEmpty()) {
                            arbol.imprimirEnOrden();
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
                        }
                        break;
                    case 4:
                        if (!arbol.isEmpty()) {
                            arbol.imprimirPostOrden();
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
                        }
                        break;
                    case 5:
                        if (!arbol.isEmpty()) {
                            arbol.imprime();
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
                        }
                        break;
                    case 6:
                        JOptionPane.showMessageDialog(null, "Aplicacion finalizada", "Fin",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion incorrecta", "Cuidado!",
                                JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error " + n.getMessage());
            }
        } while (opcion != 6);
    }
}