// Reuben Rhienhart 20112048
public class Persona {
    // Atributos
    private String nombre1;
    private String nombre2;
    private String apellidoP;
    private String apellidoM;
    private int edad;
    private String sexo;

    // Constructor
    public Persona(String nombre1, String nombre2, String apellidoP, String apellidoM, int edad, String sexo) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.edad = edad;
        this.sexo = sexo;
    }

    // Getters y Setters
    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
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
        return nombre1 + " " + nombre2 + " " + apellidoP + " "
                + apellidoM + " tiene: " + edad + " años y su sexo es: " + sexo;
    }
}
