// Reuben Rhienhart 20112048

public class Pelicula {
    // Atributos
    private String nombre;
    private String genero;
    private int cantidad;
    private int codigo;
    private double precio;
    private static int contador = 1000;

    // Constructor por omision
    public Pelicula() {
        this.nombre = "Sin nombre";
        this.genero = "Sin genero";
        this.cantidad = 0;
        this.codigo = contador++;
        this.precio = 0.0;
    }

    // Constructor con parametros
    public Pelicula(String nombre, String genero, int cantidad, double precio) {
        this.nombre = nombre;
        this.genero = genero;
        this.cantidad = cantidad;
        this.codigo = contador++;
        this.precio = precio;
    }

    // Getters y setters
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

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Pelicula.contador = contador;
    }

    // toString
    @Override
    public String toString() {
        return "\nPelicula\nNombre: " + nombre + "\nGenero: " + genero + "\nCantidad: " + cantidad + "\nCodigo: "
                + codigo + "\nPrecio: " + precio;
    }
}