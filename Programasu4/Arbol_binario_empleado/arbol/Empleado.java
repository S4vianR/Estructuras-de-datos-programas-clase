package arbol;

// import java.util.Objects;
import java.util.Objects;

public class Empleado implements Comparable<Empleado> {
    // Atributos
    private String rfc;
    private String nombre;
    private int numEmpleado;

    // Constructor
    public Empleado(String rfc, String nombre, int numEmpleado) {
        this.rfc = rfc;
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
    }

    // Métodos
    // hashCode
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.rfc);
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + this.numEmpleado;
        return hash;
    }

    // compareTo
    @Override
    public int compareTo(Empleado empleado) {
        return this.rfc.compareTo(empleado.rfc);
    }

    // equals
    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null)
            return false;
        if (!(obj instanceof Empleado))
            return false;
        final Empleado empleado = (Empleado) obj;
        if (!Objects.equals(this.rfc, empleado.rfc))
            return false;

        return true;
    }
}
