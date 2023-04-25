public class Alumno {
    // Atributos
    private String nombre;
    private int numCtrl;
    private int semestre;

       // Constructor
    public Alumno(String nombre, int numCtrl, int semestre) {
        this.nombre = nombre;
        this.numCtrl = numCtrl;
        this.semestre = semestre;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCtrl() {
        return numCtrl;
    }

    public void setNumCtrl(int numCtrl) {
        this.numCtrl = numCtrl;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    // toString
    @Override
    public String toString() {
        return "\n\t\tAlumno\nNombre: " + nombre + "\nNumero de control: " + numCtrl + "\nSemestre: " + semestre;
    }
}