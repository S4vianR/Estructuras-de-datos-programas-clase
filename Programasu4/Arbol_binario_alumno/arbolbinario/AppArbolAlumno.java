package arbolbinario;

// Import for JavaOptionPane
import javax.swing.JOptionPane;

public class AppArbolAlumno {
    public static void main(String[] args) {
        // Variables
        ArbolBinario arbol = new ArbolBinario();
        String nombre, apellidoPaterno, apellidoMaterno, carrera, numControl;
        int semestre, opcion = 0;
        double promedio;
        Alumno alumno;

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
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(null, menu, "Arboles binarios", JOptionPane.QUESTION_MESSAGE));
            switch (opcion) {
                case 1:
                    // Pedir datos
                    // Nombre completo
                    nombre = JOptionPane.showInputDialog(null, "Nombre (si tiene dos o mas, agregarlos): ", "Agregar un nodo",
                            JOptionPane.QUESTION_MESSAGE);
                    apellidoPaterno = JOptionPane.showInputDialog(null, "Apellido paterno: ", "Agregar un nodo",
                            JOptionPane.QUESTION_MESSAGE);
                    apellidoMaterno = JOptionPane.showInputDialog(null, "Apellido materno: ", "Agregar un nodo",
                            JOptionPane.QUESTION_MESSAGE);

                    // Carrera
                    carrera = JOptionPane.showInputDialog(null, "Carrera: ", "Agregar un nodo",
                            JOptionPane.QUESTION_MESSAGE);

                    // Semestre
                    semestre = Integer.parseInt(JOptionPane.showInputDialog(null, "Semestre: ", "Agregar un nodo",
                            JOptionPane.QUESTION_MESSAGE));
                    // Promedio
                    promedio = Double.parseDouble(JOptionPane.showInputDialog(null, "Promedio: ", "Agregar un nodo",
                            JOptionPane.QUESTION_MESSAGE));

                    // Numero de control
                    numControl = JOptionPane.showInputDialog(null, "Numero de control: ", "Agregar un nodo",
                            JOptionPane.QUESTION_MESSAGE);

                    // Crear objeto
                    alumno = new Alumno(numControl, nombre, apellidoPaterno, apellidoMaterno, carrera, semestre,
                            promedio);

                    // Agregar al arbol
                    arbol.insertar(alumno);
                    break;
                case 2:
                    if (!arbol.isEmpty())
                        arbol.preorden();
                    else
                        JOptionPane.showMessageDialog(null, "El árbol está vacío", "Árbol vacío",
                                JOptionPane.ERROR_MESSAGE);
                    break;
                case 3:
                    if (!arbol.isEmpty())
                        arbol.inorden();
                    else
                        JOptionPane.showMessageDialog(null, "El árbol está vacío", "Árbol vacío",
                                JOptionPane.ERROR_MESSAGE);
                    break;
                case 4:
                    if (!arbol.isEmpty())
                        arbol.postorden();
                    else
                        JOptionPane.showMessageDialog(null, "El árbol está vacío", "Árbol vacío",
                                JOptionPane.ERROR_MESSAGE);
                    break;
                case 5:
                    // Pedir numero de control
                    numControl = JOptionPane.showInputDialog(null, "Numero de control: ", "Buscar un nodo",
                            JOptionPane.QUESTION_MESSAGE);

                    // Buscar
                    alumno = new Alumno(numControl, "", "", "", "", 0, 0);

                    // Mostrar
                    if (arbol.buscar(alumno) != null)
                        JOptionPane.showMessageDialog(null, arbol.buscar(alumno), "Nodo encontrado",
                                JOptionPane.INFORMATION_MESSAGE);
                    else
                        JOptionPane.showMessageDialog(null, "Nodo no encontrado", "Nodo no encontrado",
                                JOptionPane.ERROR_MESSAGE);
                    break;
                case 6:
                    // Pedir numero de control
                    numControl = JOptionPane.showInputDialog(null, "Numero de control: ", "Eliminar un nodo",
                            JOptionPane.QUESTION_MESSAGE);

                    // Buscar
                    alumno = new Alumno(numControl, "", "", "", "", 0, 0);

                    // Eliminar
                    arbol.eliminar(alumno);
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
