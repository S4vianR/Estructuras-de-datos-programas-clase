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
            JOptionPane.showMessageDialog(null, "El dato " + dato + " no se encuentra en el arreglo", "Dato no encontrado",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }   
    public static void main(String[] args) {
        // Arraylist para guardar los objetos de tipo persona
        ArrayList<persona> personas = new ArrayList<persona>();
        // Objeto de tipo persona

}