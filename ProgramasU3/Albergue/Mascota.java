public class Mascota {
    private String nombre;
    private int edad;
    private static int pos = 0;
    private int posicion;

    // Constructor
    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = pos;
        pos++;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getPosicion() {
        return posicion;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    // toString
    @Override
    public String toString() {
        return "\nNombre: " + nombre + "\nEdad: " + edad + "\nPosicion: " + posicion + "\n";
    }
}