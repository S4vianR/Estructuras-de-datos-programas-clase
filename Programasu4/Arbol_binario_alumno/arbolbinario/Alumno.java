package arbolbinario;

public class Alumno implements Comparable{
    // Atributos
    private String noControl;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String carrera;
    private int semestre;
    private double promedio;

    // Constructor
    public Alumno(String noControl, String nombre, String apellidoPaterno, String apellidoMaterno, String carrera,
            int semestre, double promedio) {
        this.noControl = noControl;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.carrera = carrera;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    // Getters y setters
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Numero de control: " + noControl + "\nNombre: " + nombre + "\nApellido paterno: " + apellidoPaterno
                + "\nApellido materno: " + apellidoMaterno + "\nCarrera: " + carrera + "\nSemestre: " + semestre
                + "\nPromedio: " + promedio;
    }

    // Metodo compareTo
    @Override
    public int compareTo(Object objeto) {
        if (objeto == null) {
            return -1;
        }

        if (getClass() != objeto.getClass()) {
            throw new UnsupportedOperationException("Los objetos no son de la misma clase");
        }

        final Alumno other = (Alumno) objeto;
        return this.noControl.compareTo(other.noControl);
    }

    // Metodo equals
    @Override
    public boolean equals(Object objeto) {
        if (this == objeto) {
            return true;
        }

        if (objeto == null) {
            return false;
        }

        if (getClass() != objeto.getClass()) {
            return false;
        }

        final Alumno other = (Alumno) objeto;
        return this.noControl.equals(other.noControl);
    }
}
