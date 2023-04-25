// Reuben Rhienhart 20112048
public class Persona {
    // Atributos
    private String nombre;
    private String apellido;
    private int edad;
    private String sexo;
    
    // Constructor
    public Persona(String nombre, String apellido, int edad, String sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.sexo = sexo;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    // toString
    @Override
    public String toString() {
        return "\nNombre: " + nombre + apellido + " tiene " + edad + " años y su sexo es: " + sexo;
    }
}