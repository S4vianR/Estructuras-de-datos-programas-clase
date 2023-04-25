import java.util.Arrays;
import java.util.Scanner;

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
public class Agenda {
    private Contactos[] Miscontactos;
    private int numContactos;

    // Constructor por omision
    public Agenda() {
        this.Miscontactos = new Contactos[100];
        this.numContactos = 0;
    }

    // Constructor con parametros
    public Agenda(Contactos[] Miscontactos, int numContactos) {
        this.Miscontactos = Miscontactos;
        this.numContactos = numContactos >= 0 ? numContactos : 0;
    }

    // Getters y setters
    public Contactos[] getMiscontactos() {
        return Miscontactos;
    }

    public void setMiscontactos(Contactos[] miscontactos) {
        Miscontactos = miscontactos;
    }

    public int getNumContactos() {
        return numContactos;
    }

    public void setNumContactos(int numContactos) {
        this.numContactos = numContactos;
    }

    // toString
    @Override
    public String toString() {
        return "Agenda [Miscontactos=" + Arrays.toString(Miscontactos) + ", numContactos=" + numContactos + "]";
    }

    // Metodos

    /*
     * Agregar contacto, mientras el numero de contactos sea menor a 100 se agrega
     * el contacto
     */
    public void agregarContacto(Contactos contacto) {
        if (this.numContactos < 100) {
            this.Miscontactos[this.numContactos] = contacto;
            this.numContactos++;
        }
    }

    // Eliminar contacto
    public void eliminarContacto(int num) {
        if (this.numContactos >= 0) {
            this.Miscontactos[num].setNombre(null);
            this.Miscontactos[num].setTelefono(null);
            this.Miscontactos[num].setEmail(null);
            this.numContactos--;
        }
    }

    // sobreescribe el contacto
    public void sobreescribirContacto(Contactos contacto, int num) {
        if (this.numContactos > 0) {
            this.Miscontactos[num] = contacto;
        }
    }

    // Listar contactos de la agenda
    public void listarContactos() {
        for (int i = 0; i < this.numContactos; i++) {
            System.out.println("\nContacto no. " + i + this.Miscontactos[i]);
        }
        if (this.numContactos == 0) {
            Contactos contacto = new Contactos(null, null, null);
            System.out.println("No hay contactos agregados, desea agregar uno?\n1. Si\n2. No");
            Scanner resp = new Scanner(System.in);
            String respuesta = resp.nextLine();
            switch (respuesta) {
                case "1":
                    agregarContacto(contacto);
                case "2":
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        }
    }

}
