// Reuben Rhienhart
public class Pelicula {
    // Atributos
    private String nombre;
    private String genero;
    private int cantidad;
    private int codigo;
    private double precio;

    // Constructor por omisión
    public Pelicula() {
        this.nombre = "";
        this.genero = "";
        this.cantidad = 0;
        this.codigo = 0;
        this.precio = 0.0;
    }

    // Constructor con parámetros
    public Pelicula(String nombre, String genero, int cantidad, int codigo, double precio) {
        this.nombre = nombre;
        this.genero = genero;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.precio = precio;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    // toString
    @Override
    public String toString() {
        return "\nNombre de la pelicula: " + nombre + "\nGenero: " + genero + "\nCantidad: " + cantidad + "\nCodigo: " + codigo + "\nPrecio: " + precio;
    }
}