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

    // Getters y Setters
    public Object getDato() {
        return dato;
    }

    public NodoArbol getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public NodoArbol getHijoDerecho() {
        return hijoDerecho;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    // toString
    public String toString() {
        return dato + " ";
    }
}