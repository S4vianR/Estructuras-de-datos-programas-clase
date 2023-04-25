import javax.sound.sampled.SourceDataLine;

public class MainPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona("Juan", "Perez", "Gomez", "Lopez", 20, "Masculino");
        Persona p3 = new Persona("Maria", "Gomez", "Lopez", "Perez", 25, "Femenino");

        System.out.println("Direccion de p1: " + System.identityHashCode(p1));
        System.out.println("Direccion de p3: " + System.identityHashCode(p3));
        p3 = p1;
        System.out.println("Cambiando la direcicon de p3");
        System.out.println("Direccion de p3: " + System.identityHashCode(p3));
        p3.setApellidoP("Gonzalez");
        System.out.println(p1);
        System.out.println(p3);
        p1 = null;
        System.out.println(p3);
    }
}