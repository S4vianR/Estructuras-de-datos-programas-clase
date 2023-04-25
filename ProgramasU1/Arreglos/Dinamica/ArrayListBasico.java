
// Reuben Rhienhart 20112048
import java.util.ArrayList;

public class ArrayListBasico {
    public static void main(String[] args) {
        // Paises
        System.out.println("ArrayList de paises");
        ArrayList<String> listaPaises = new ArrayList<String>();
        listaPaises.add("Brasil");
        listaPaises.add("Argentina");
        listaPaises.add("Chile");
        System.out.println(listaPaises);
        listaPaises.add(1, "Uruguay");
        System.out.println(listaPaises);
        System.out.println("\nEl tamaño del array es de: " + listaPaises.size());
        System.out.println("\nEl indice del elemento X es de: " + listaPaises.indexOf(listaPaises.get(1)));
        if (listaPaises.contains(listaPaises.get(1))) {
            System.out.println("\nEl elemento X si existe en el array");
        } else {
            System.out.println("\nEl elemento X no existe en el array");
        }
        System.out.println("\nEl elemento en el indice X es de: " + listaPaises.get(1));
        listaPaises.remove(1);
        System.out.println(listaPaises.get(1));

        // Edades
        System.out.println("\n\nArrayList de edades");
        ArrayList<Integer> edades = new ArrayList<Integer>();
        edades.add(10);
        edades.add(20);
        edades.add(23);
        System.out.println(edades);
        edades.add(1, 21);
        System.out.println(edades);
        System.out.println("\nEl tamaño del array es de: " + edades.size());
        System.out.println("\nEl indice del elemento X es de: " + edades.indexOf(edades.get(1)));
        if (edades.contains(edades.get(1))) {
            System.out.println("\nEl elemento X si existe en el array");
        } else {
            System.out.println("\nEl elemento X no existe en el array");
        }
        System.out.println("\nEl elemento en el indice X es de: " + edades.get(1));
        edades.remove(1);
        System.out.println(edades.get(1));
    }
}