
/* 
 * Reuben Rhienhart 20112048
 * Instrucciones
 * Hacer un menu con las siguientes opciones/:
 * 1. Agregar contacto
 * 2. Eliminar contacto
 * 3. Mostrar contacto
 * 4. Sobreescribir contacto
 * 5. Salir
*/
import java.util.Scanner;

public class AppAgenda {
    public static void main(String[] args) {
        int op = 0;
        String nombre, telefono, correo;
        Scanner opc = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        Scanner s4 = new Scanner(System.in);
        // Arreglo de contactos
        Contactos[] contactos = new Contactos[100];

        // Objeto de la clase Agenda
        Agenda agenda = new Agenda();

        // Menu
        do {
            System.out.println(
                    "\nMenu\n1. Agregar contacto\n2. Eliminar contacto\n3. Listar contacto\n4. Sobreescribir contactos\n5. Salir\n");
            System.out.println("Opcion: ");
            op = opc.nextInt();
            switch (op) {
                case 1:
                    // Agregar contacto
                    System.out.println("Nombre del contacto: ");
                    nombre = s1.nextLine();
                    System.out.println("Numero de telefono: ");
                    telefono = s2.nextLine();
                    System.out.println("Correo electronico: ");
                    correo = s3.nextLine();
                    agenda.agregarContacto(new Contactos(nombre, telefono, correo));
                    break;
                case 2:
                    // Eliminar un contacto del arreglo segun la posicion indicada
                    agenda.listarContactos();
                    System.out.println("\nNumero de contacto a eliminar: ");
                    int num = opc.nextInt();
                    agenda.eliminarContacto(num);
                    break;
                case 3:
                    // Mostrar contactos
                    agenda.listarContactos();
                    break;
                case 4:
                    // Sobreescribir contacto
                    agenda.listarContactos();
                    System.out.println("\nNumero de contacto a sobreescribir: ");
                    int num2 = opc.nextInt();
                    System.out.println("Nombre del contacto: ");
                    nombre = s1.nextLine();
                    System.out.println("Numero de telefono: ");
                    telefono = s2.nextLine();
                    System.out.println("Correo electronico: ");
                    correo = s3.nextLine();
                    agenda.sobreescribirContacto(new Contactos(nombre, telefono, correo), num2);
                    break;
                case 5:
                    // Salir
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (op != 5);
    }
}
