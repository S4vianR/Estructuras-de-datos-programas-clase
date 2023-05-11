package arbol;

public class NodoArbol {
    // Atributos
    Object dato;
    NodoArbol hijoIzquierdo;
    NodoArbol hijoDerecho;

    // Constructor
    public NodoArbol(Object dato) {
        this.dato = dato;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    // toString
    public String toString() {
        return dato + " ";
    }
}