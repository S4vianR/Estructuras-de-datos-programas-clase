package Clase_alumno;
public class Alumnos {
    private String nombre;
    private int matricula;
    private float promedio;

    public Alumnos(String nombre, int matricula, float promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public float getPromedio() {
        return promedio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setPromedio(float promedio) {
        this.promedio = promedio;
    }

    public String toString() {
        return "Nombre: " + nombre + "\nMatricula: " + matricula + "\nPromedio: " + promedio;
    }
}