public class Gato extends Mascota{
    private String raza;

    // Constructor
    public Gato(String nombre, int edad, String raza) {
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
        return "\nGato\nRaza: " + raza + super.toString();
    }
}