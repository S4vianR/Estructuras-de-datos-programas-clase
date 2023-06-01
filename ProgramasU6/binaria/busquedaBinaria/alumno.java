package busquedaBinaria;

public class alumno {
    // Atributos
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private int edad;
    private String carrera;
    private int numeroDeControl;

    // Constructor
    public alumno(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, int edad,
            String carrera, int numeroDeControl) {
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.edad = edad;
        this.carrera = carrera;
        this.numeroDeControl = numeroDeControl;
    }

    // Getters
    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getNumeroDeControl() {
        return numeroDeControl;
    }

    // Setters con validaciones
    public void setPrimerNombre(String primerNombre) {
        if (primerNombre.length() > 0) {
            this.primerNombre = primerNombre;
        } else {
            System.out.println("El primer nombre no puede estar vacío");
        }
    }

    // El segundo nombre puede estar vacío
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public void setPrimerApellido(String primerApellido) {
        if (primerApellido.length() > 0) {
            this.primerApellido = primerApellido;
        } else {
            System.out.println("El primer apellido no puede estar vacío");
        }
    }

    // El segundo apellido puede estar vacío
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser menor o igual a 0");
        }
    }

    public void setCarrera(String carrera) {
        if (carrera.length() > 0) {
            this.carrera = carrera;
        } else {
            System.out.println("La carrera no puede estar vacía");
        }
    }

    public void setNumeroDeControl(int numeroDeControl) {
        if (numeroDeControl > 0) {
            this.numeroDeControl = numeroDeControl;
        } else {
            System.out.println("El número de control no puede ser menor o igual a 0");
        }
    }

    // Método toString legible para el usuario
    @Override
    public String toString() {
        return "Nombre: " + primerNombre + " " + segundoNombre + " " + primerApellido + " " + segundoApellido
                + "\nEdad: " + edad + "\nCarrera: " + carrera + "\nNúmero de control: " + numeroDeControl;
    }
}
