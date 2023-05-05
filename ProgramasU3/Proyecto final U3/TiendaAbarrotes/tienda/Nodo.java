package tienda;

public class Nodo {
    private Tienda dato;
    private Nodo siguiente;

    public Nodo(Tienda dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public Tienda getDato() {
        return dato;
    }

    public void setDato(Tienda dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return dato.toString();
    }
}
