package Clase_alumno;
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
            String menu = "1. Agregar alumno\n2. Mostrar alumnos\n3. Buscar alumno por nombre\n4. Buscar alumno por matricula\n5. Mostrar los alumnos con los mejores 3 promedios\n6. Salir";
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
                    // Search a student by name
                    String nombreBusqueda = JOptionPane.showInputDialog("Nombre del alumno");
                    String alumnoBusqueda = "";
                    for (Nodo n : lista) {
                        if (n.getAlumno().getNombre().equals(nombreBusqueda)) {
                            alumnoBusqueda = n.getAlumno().toString();
                        }
                    }
                    JOptionPane.showMessageDialog(null, alumnoBusqueda);
                    break;
                case 4:
                    // Search a student by enrollment number (matricula)
                    int matriculaBusqueda = Integer.parseInt(JOptionPane.showInputDialog("Matricula del alumno"));
                    String alumnoBusquedaMatricula = "";
                    for (Nodo n : lista) {
                        if (n.getAlumno().getMatricula() == matriculaBusqueda) {
                            alumnoBusquedaMatricula = n.getAlumno().toString();
                        }
                    }
                    JOptionPane.showMessageDialog(null, alumnoBusquedaMatricula);
                    break;
                case 5:
                    /*
                     * Mostrar los alumnos con los 3 mejores promedios de la lista sin importar cuando alumnos haya,
                     * verificar con todos los promedios de la lista y mostrar los 3 mejores,
                     * y mostrar los 3 mejores promedios con sus datos en orden descendente.
                     */
                    String mejoresAlumnos = "";
                    float promedioMayor = 0;
                    float promedioMayor2 = 0;
                    float promedioMayor3 = 0;
                    for (Nodo n : lista) {
                        if (n.getAlumno().getPromedio() > promedioMayor) {
                            promedioMayor = n.getAlumno().getPromedio();
                        }
                    }
                    for (Nodo n : lista) {
                        if (n.getAlumno().getPromedio() > promedioMayor2 && n.getAlumno().getPromedio() < promedioMayor) {
                            promedioMayor2 = n.getAlumno().getPromedio();
                        }
                    }
                    for (Nodo n : lista) {
                        if (n.getAlumno().getPromedio() > promedioMayor3 && n.getAlumno().getPromedio() < promedioMayor2) {
                            promedioMayor3 = n.getAlumno().getPromedio();
                        }
                    }
                    for (Nodo n : lista) {
                        if (n.getAlumno().getPromedio() == promedioMayor) {
                            mejoresAlumnos += n.getAlumno().toString() + "\n\n";
                        }
                    }
                    for (Nodo n : lista) {
                        if (n.getAlumno().getPromedio() == promedioMayor2) {
                            mejoresAlumnos += n.getAlumno().toString() + "\n\n";
                        }
                    }
                    for (Nodo n : lista) {
                        if (n.getAlumno().getPromedio() == promedioMayor3) {
                            mejoresAlumnos += n.getAlumno().toString() + "\n\n";
                        }
                    }
                    JOptionPane.showMessageDialog(null, mejoresAlumnos);
                    break;
                case 6:
                    // Exit
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion invalida");
                    break;
            }
        } while (opcion != 6);
    }
}
