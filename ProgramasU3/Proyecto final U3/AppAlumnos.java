// Import for JOptionPane
import javax.swing.JOptionPane;

// Import for LinkedList
import java.util.LinkedList;

public class AppAlumnos {
    // Main method
    public static void main(String[] args) {
        // Create a new linked list
        LinkedList<Nodo> lista = new LinkedList<Nodo>();

        // Menu
        int opcion = 0;
        do {
            String menu = "1. Agregar alumno a documento\n2. Mostrar alumnos\n3. Buscar alumno\n4. Salir";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1:
                    // Add a new student to the list
                    String nombre = JOptionPane.showInputDialog("Nombre del alumno");
                    int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matricula del alumno"));
                    float promedio = Float.parseFloat(JOptionPane.showInputDialog("Promedio del alumno"));
                    Alumnos alumno = new Alumnos(nombre, matricula, promedio);
                    Nodo nodo = new Nodo(alumno);
                    lista.add(nodo);
                    break;
                case 2:
                    // Show all students
                    String alumnos = "";
                    for (Nodo n : lista) {
                        alumnos += n.getAlumno().toString() + "\n\n";
                    }
                    JOptionPane.showMessageDialog(null, alumnos);
                    break;
                case 3:
                    // Search for a student
                    String busqueda = JOptionPane.showInputDialog("Nombre o matricula del alumno");
                    String resultado = "";
                    for (Nodo n : lista) {
                        if (n.getAlumno().getNombre().equals(busqueda)
                                || n.getAlumno().getMatricula() == Integer.parseInt(busqueda)) {
                            resultado = n.getAlumno().toString();
                        }
                    }
                    JOptionPane.showMessageDialog(null, resultado);
                    break;
                case 4:
                    // Exit
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                    break;
            }
        } while (opcion != 4);
    }
}
