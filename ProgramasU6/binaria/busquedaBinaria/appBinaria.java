package busquedaBinaria;

// JOption
import javax.swing.JOptionPane;

// Arraylist
import java.util.ArrayList;

public class appBinaria {
    public static void main(String[] args) {
        // Arraylist de alumnos
        ArrayList<alumno> alumnos = new ArrayList<alumno>();

        // Variables
        String primerNombre;
        String segundoNombre;
        String primerApellido;
        String segundoApellido;
        int edad;
        String carrera;
        int numeroDeControl;
        int opcion;

        // Menu
        String menu = "1) Agregar alumno\n2) Buscar alumno\n3) Mostrar alumnos\n4) Salir";
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcion) {
                case 1:
                    // Agregar alumno
                    primerNombre = JOptionPane.showInputDialog("Primer nombre");
                    segundoNombre = JOptionPane.showInputDialog("Segundo nombre");
                    primerApellido = JOptionPane.showInputDialog("Primer apellido");
                    segundoApellido = JOptionPane.showInputDialog("Segundo apellido");
                    edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
                    carrera = JOptionPane.showInputDialog("Carrera");
                    numeroDeControl = Integer.parseInt(JOptionPane.showInputDialog("Número de control"));
                    alumnos.add(new alumno(primerNombre, segundoNombre, primerApellido, segundoApellido, edad, carrera,
                            numeroDeControl));
                    break;
                case 2:
                    // Buscar alumno
                    numeroDeControl = Integer.parseInt(JOptionPane.showInputDialog("Número de control a buscar"));
                    busquedaBinaria(alumnos, numeroDeControl, 0, alumnos.size() - 1);
                    break;
                case 3:
                    // Mostrar alumnos for each
                    for (alumno alumno : alumnos) {
                        JOptionPane.showMessageDialog(null, alumno.toString());
                    }
                    break;
                case 4:
                    // Salir
                    JOptionPane.showMessageDialog(null, "Adios");
                    break;
                default:
                    // Opcion invalida
                    JOptionPane.showMessageDialog(null, "Opción invalida");
                    break;
            }

        } while (opcion != 4);
    }

    // Busqueda binaria
    public static void busquedaBinaria(ArrayList<alumno> alumnos, int numeroDeControl, int principio, int fin) {
        // Busqueda por numero de control
        if (alumnos.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No hay alumnos registrados", "No encontrado",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        int medio = principio + fin / 2;
        while (principio <= fin) {
            if (alumnos.get(medio).getNumeroDeControl() < numeroDeControl) {
                principio = medio + 1;
            } else if (alumnos.get(medio).getNumeroDeControl() == numeroDeControl) {
                JOptionPane.showMessageDialog(null,
                        "Alumno encontrado, en la posicion: " + medio + 1 + "\n" + alumnos.get(medio).toString());
                break;
            } else {
                fin = medio - 1;
            }
            medio = (principio + fin) / 2;
        }
        if (principio > fin) {
            JOptionPane.showMessageDialog(null, "Alumno no encontrado", "No encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }
}
