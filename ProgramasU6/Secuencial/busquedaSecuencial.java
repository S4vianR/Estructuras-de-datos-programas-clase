package secuencial;

// JOptionPane
import javax.swing.JOptionPane;

// Arraylist
import java.util.ArrayList;

public class busquedaSecuencial {
    // Método para buscar un dato en un arreglo
    public static void busquedaSecuencial(int[] arr, int dato) {
        // ArrayList para guardar los índices donde se encuentra el dato
        ArrayList<Integer> indices = new ArrayList<Integer>();
        // Bandera para saber si se encontró el dato
        boolean encontrado = false;
        // Recorrer el arreglo
        for (int i = 0; i < arr.length; i++) {
            // Si el dato se encuentra en el arreglo
            if (arr[i] == dato) {
                // Agregar el índice al ArrayList
                indices.add(i);
                // Cambiar el valor de la bandera
                encontrado = true;
            }
        }
        // Si se encontró el dato
        if (encontrado) {
            // Imprimir los índices donde se encuentra el dato
            JOptionPane.showMessageDialog(null, "El dato " + dato + " se encuentra en los índices: " + indices,
                    "Dato encontrado", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Imprimir que no se encontró el dato
            JOptionPane.showMessageDialog(null, "El dato " + dato + " no se encuentra en el arreglo",
                    "Dato no encontrado",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String[] args) {
        // Arraylist para guardar los objetos de tipo persona
        ArrayList<persona> personas = new ArrayList<persona>();
        // Objeto de tipo persona
        Persona persona = new Persona();
        // Variables
        int opcion = 0, edad = 0, dato = 0;
        String nombre = "", sexo = "";

        // Ciclo para mostrar el menú
        do {
            // Menú
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "1. Agregar persona\n2. Buscar persona\n3. Mostrar personas\n4. Salir", "Menú",
                    JOptionPane.INFORMATION_MESSAGE));
            // Según la opción
            switch (opcion) {
                // Agregar persona
                case 1:
                    // Pedir el nombre
                    nombre = JOptionPane.showInputDialog(null, "Ingresa el nombre de la persona", "Nombre",
                            JOptionPane.INFORMATION_MESSAGE);
                    // Pedir la edad
                    edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa la edad de la persona", "Edad",
                            JOptionPane.INFORMATION_MESSAGE));
                    // Agregar la persona al ArrayList
                    personas.add(new Persona(nombre, edad));
                    break;
                // Buscar persona
                case 2:
                    // Pedir el dato a buscar
                    dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el dato a buscar", "Dato",
                            JOptionPane.INFORMATION_MESSAGE));
                    // Buscar el dato en el ArrayList
                    busquedaSecuencial(personas, dato);
                    break;
                // Mostrar personas
                case 3:
                    // Recorrer el ArrayList
                    for (int i = 0; i < personas.size(); i++) {
                        // Imprimir la persona
                        JOptionPane.showMessageDialog(null,
                                "Persona " + (i + 1) + "\nNombre: " + personas.get(i).getNombre()
                                        + "\nEdad: " + personas.get(i).getEdad(),
                                "Persona", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                // Salir
                case 4:
                    // Imprimir que se salió del programa
                    JOptionPane.showMessageDialog(null, "Saliendo del programa", "Salir",
                            JOptionPane.INFORMATION_MESSAGE);
                    break;
                // Opción inválida
                default:
                    // Imprimir que la opción es inválida
                    JOptionPane.showMessageDialog(null, "Opción inválida", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } while (opcion != 4);
    }
}