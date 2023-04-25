// Reuben Rhienhart 20112048
public class ListaPersonas {
    public static int edadMaxima(Persona[] personas) {
        int max = personas[0].getEdad();
        int i = 1;
        while (i < personas.length) {
            if (personas[i].getEdad() > max) {
                max = personas[i].getEdad();
            }
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        Persona[] lista = new Persona[5];
        lista[0] = new Persona("Reuben", "Rhienhart", 20, "Masculino");
        lista[1] = new Persona("Juan", "Perez", 30, "Masculino");
        lista[2] = new Persona("Maria", "Gomez", 40, "Femenino");
        lista[3] = new Persona("Pedro", "Gonzalez", 50, "Masculino");
        lista[4] = new Persona("Luisa", "Rodriguez", 60, "Femenino");
        System.out.println("La edad maxima es: " + edadMaxima(lista));
    }
}
