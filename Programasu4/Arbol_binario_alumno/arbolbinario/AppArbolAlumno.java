package arbolbinario;

// Import JOptionPane
import javax.swing.JOptionPane;

public class AppArbolAlumno {
    public static void main(String[] args) {
        // Variables
        int opcion = 0, semestre;
        String noControl, nombre, apellidoPaterno, apellidoMaterno, carrera;
        double promedio;
        // Crear un arbol binario
        ArbolBinario arbol = new ArbolBinario();

        // Menu
        do {
            String menu = "Menu de opciones\n" + "1. Agregar un nodo\n" + "2. Recorrer el arbol en order\n"
                    + "3. Recorrer el arbol en preorden\n" + "4. Recorrer el arbol en postorden\n"
                    + "5. Buscar un nodo en el arbol\n" + "6. Eliminar un nodo del arbol\n" + "7. Salir\n"
                    + "Ingresa una opcion:";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, menu));
            // Nombres de los metodos usados
            // 1: agregarNodo
            // 2: recorrerEnOrden
            // 3: recorrerEnPreorden
            // 4: recorrerEnPostorden
            // 5: buscarNodo
            // 6: eliminarNodo
            // 7: salir
            switch (opcion) {
                case 1: {
                    // 1: agregarNodo
                    /*
                     * Constructor
                     * public Alumno(String noControl, String nombre, String apellidoPaterno, String
                     * apellidoMaterno, String carrera,
                     * int semestre, double promedio) {
                     * this.noControl = noControl;
                     * this.nombre = nombre;
                     * this.apellidoPaterno = apellidoPaterno;
                     * this.apellidoMaterno = apellidoMaterno;
                     * this.carrera = carrera;
                     * this.semestre = semestre;
                     * this.promedio = promedio;
                     * }
                     */

                    // Pedir los datos del alumno
                    noControl = JOptionPane.showInputDialog(null, "Ingresa el numero de control:");
                    nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre:");
                    apellidoPaterno = JOptionPane.showInputDialog(null, "Ingresa el apellido paterno:");
                    apellidoMaterno = JOptionPane.showInputDialog(null, "Ingresa el apellido materno:");
                    carrera = JOptionPane.showInputDialog(null, "Ingresa la carrera:");
                    semestre = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el semestre:"));
                    promedio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el promedio:"));

                    // Crear un alumno
                    Alumno alumno = new Alumno(noControl, nombre, apellidoPaterno, apellidoMaterno, carrera, semestre,
                            promedio);
                    
                    // Insertar el nodo
                    arbol.agregarNodo(alumno);
                    break;
                }
                case 2: {
                    // 2: recorrerEnOrden
                    // Recorrer el arbol en orden
                    arbol.recorrerEnOrden(arbol.getRaiz());
                    break;
                }
                case 3: {
                    // 3: recorrerEnPreorden
                    // Recorrer el arbol en preorden
                    arbol.recorrerEnPreorden(arbol.getRaiz());
                    break;
                }
                case 4: {
                    // 4: recorrerEnPostorden
                    // Recorrer el arbol en postorden
                    arbol.recorrerEnPostorden(arbol.getRaiz());
                    break;
                }
                case 5: {
                    // 5: buscarNodo
                    // Pedir el numero de control
                    noControl = JOptionPane.showInputDialog(null, "Ingresa el numero de control:");
                    // Buscar el nodo
                    arbol.buscarNodo(noControl);
                    break;
                }
                case 6:
                    // 6: eliminarNodo
                    // Pedir el numero de control
                    noControl = JOptionPane.showInputDialog(null, "Ingresa el numero de control:");
                    // Eliminar el nodo
                    arbol.eliminarNodo(noControl);
                    break;
                case 7:
                    // 7: salir
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
                    break;
            }
        } while (opcion != 7);
    }
}