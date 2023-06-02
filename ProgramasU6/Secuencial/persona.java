package secuencial;

// JOptionPane
import javax.swing.JOptionPane;

public class persona {
    // Atributos
    private String nombre;
    private int edad;
    private String sexo;

    // Constructor
    public persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    // Setters (los setters con validación)
    public void setNombre(String nombre) {
        if (nombre.length() > 0) {
            this.nombre = nombre;
        } else {
            System.out.println("El nombre no puede estar vacío");
        }
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            JOptionPane.showMessageDialog(null, "La edad debe ser mayor a 0", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void setSexo(String sexo) {
        if (sexo.equals("M") || sexo.equals("F")) {
            this.sexo = sexo;
        } else {
            JOptionPane.showMessageDialog(null, "El sexo debe ser M o F", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    // toString legible
    @Override
    public String toString() {
        return "\nNombre:" + nombre + "\nEdad:" + edad + "\nSexo:" + sexo;
    }
    
}
