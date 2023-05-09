package arbolbinario;

// Clase que representa un nodo de un arbol binario
// Contiene un dato, un nodo izquierdo y un nodo derecho
public class NodoArbol {
    // Atributos
    private Object dato;
    private NodoArbol izquierdo;
    private NodoArbol derecho;

    // Constructor
    public NodoArbol(Object dato) {
        this.dato = dato;
        izquierdo = null;
        derecho = null;
    }

    // Getters y Setters
    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    public NodoArbol getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoArbol izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoArbol getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoArbol derecho) {
        this.derecho = derecho;
    }

    // toString
    @Override
    public String toString() {
        return dato.toString();
    }

}
