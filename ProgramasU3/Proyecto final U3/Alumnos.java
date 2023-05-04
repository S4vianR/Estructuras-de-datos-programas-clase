/*
 * Diseñar clases para definir tipos adecuados para los siguientes contextos (ejemplos: clase
 * Alumno, Cuenta, por mencionar algunas), así como nodos y una clase para manejar diferentes
 * operaciones de la lista para los siguientes contextos:
 * 
 * Generar reportes en base a archivos para alumnos de una escuela. En la aplicación se
 * podrá seleccionar el archivo a utilizar. La lista deberá ser capaz de ordenar por número de
 * matrícula, además deberá mostrar los datos de los tres mejores promedios de los datos
 * registrados en cada archivo. Deberá proporcionarle al usuario la capacidad de buscar en
 * la lista ya sea por número de matrícula o por nombre del alumno.
 */
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