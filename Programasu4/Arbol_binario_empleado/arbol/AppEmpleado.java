package arbol;

// Import for JavaOptionPane
import javax.swing.JOptionPane;

public class AppEmpleado {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("123456789", "Juan", 1);
        Empleado e2 = new Empleado("987654321", "Pedro", 2);
        Empleado e3 = new Empleado("456789123", "María", 3);
        Empleado e4 = new Empleado("321654987", "Ana", 4);
        Empleado e5 = new Empleado("789123456", "Luis", 5);
        Empleado e6 = new Empleado("654987321", "José", 6);

        ArbolBinario arbol = new ArbolBinario();
        arbol.insertar(e1);
        arbol.insertar(e2);
        arbol.insertar(e3);
        arbol.insertar(e6);
        arbol.insertar(e4);
        arbol.insertar(e5);

        arbol.toString();

        arbol.preorden();
        arbol.inorden();
        arbol.postorden();

    }
}
