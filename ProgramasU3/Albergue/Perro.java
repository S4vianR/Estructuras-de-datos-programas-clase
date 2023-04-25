public class Perro extends Mascota{
    private String raza;

    // Constructor
    public Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    // Getters
    public String getRaza() {
        return raza;
    }

    // Setters
    public void setRaza(String raza) {
        this.raza = raza;
    }

    // toString
    @Override
    public String toString() {
        return "\nPerro\nRaza: " + raza + super.toString();
    }
}