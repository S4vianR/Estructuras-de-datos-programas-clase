 package tienda;

 public class Tienda {
    private int numParte;
    private double precioUnitario;
    private String descripcion;
    private int cantidadInventario;

    public Tienda(int numParte, double precioUnitario, String descripcion, int cantidadInventario) {
        this.numParte = numParte;
        this.precioUnitario = precioUnitario;
        this.descripcion = descripcion;
        this.cantidadInventario = cantidadInventario;
    }

    public int getNumParte() {
        return numParte;
    }

    public void setNumParte(int numParte) {
        this.numParte = numParte;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidadInventario() {
        return cantidadInventario;
    }

    public void setCantidadInventario(int cantidadInventario) {
        this.cantidadInventario = cantidadInventario;
    }

    @Override
    public String toString() {
        return "\nNúmero de parte: " + numParte + "\n" +
                "Precio unitario: " + precioUnitario + "\n" +
                "Descripción: " + descripcion + "\n" +
                "Cantidad en inventario: " + cantidadInventario + "\n";
    }
 }