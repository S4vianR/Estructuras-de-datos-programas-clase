import java.util.Scanner;

public class AppPila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pila pila = new Pila();
        int opcion = 0;
        do {
            System.out.println("1. Ingresar dato - Push");
            System.out.println("2. Eliminar dato - Pop");
            System.out.println("3. Buscar dato - Peek");
            System.out.println("4. Modificar dato");
            System.out.println("5. Mostrar datos");
            System.out.println("6. Salir");
            System.out.println("Ingrese una opcion");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el dato");
                    int dato = sc.nextInt();
                    pila.push(dato);
                    break;
                case 2:
                    pila.pop();
                    break;
                case 3:
                    pila.buscarNodo();
                    break;
                case 4:
                    pila.modificarNodo();
                    break;
                case 5:
                    System.out.println(pila.toString());
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
        } while (opcion != 6);
    }
}