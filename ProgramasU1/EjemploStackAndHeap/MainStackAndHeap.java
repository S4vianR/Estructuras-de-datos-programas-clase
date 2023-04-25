// Reuben Rhienhart 20112048
public class MainStackAndHeap {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            int enteroLocal = 5;
            String cadena = "Local";
            String cadenaLocal = new String("Ejemplo");
            EjemploStackAndHeap e = new EjemploStackAndHeap();
            e.setAtributoEntero(enteroLocal);
            e.setAtributoCadena(cadenaLocal);
            System.out.print("Stack: " + System.identityHashCode(enteroLocal));
            System.out.print(" Stack" + System.identityHashCode(cadena));
            System.out.print(" Heap: " + System.identityHashCode(cadenaLocal));
            System.out.println(" Heap: " + System.identityHashCode(e));
        }
    }
}
