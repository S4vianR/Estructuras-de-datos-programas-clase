/*
 * Hacer un sistema para el manejo de inventarios de una tienda de abarrotes. Al
 * registrar
 * los datos se deberán ir insertado por orden de número de parte de los
 * productos sin
 * aceptar números duplicados. Además, deberán registrarse el precio unitario
 * del producto,
 * descripción y cantidad en inventario. El usuario podrá ver la lista de
 * productos en pantalla,
 * mostrando todos los datos de cada producto. Además, deberá tener una opción
 * para
 * manejar las compras de productos, para ello solicitar el número de parte y la
 * cantidad a
 * comprar. Deberá verificar que la cantidad a comprar no exceda la cantidad en
 * inventario.
 * En caso de que la compra sea exitosa actualizar la cantidad en inventario.
 * Además, agregar
 * la opción de actualizar la cantidad en inventario de los productos cuando se
 * surtan en
 * almacén cada uno de ellos.
 */

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