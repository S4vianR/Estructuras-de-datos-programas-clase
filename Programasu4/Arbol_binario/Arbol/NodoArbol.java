// Crear una clase ArbolBinario que contenga un hijo izquierdo, un hijo derecho del tipo NodoArbol y dato.
package Arbol;

public class NodoArbol {
    // Atributos
    private NodoArbol hijoIzquierdo;
    private NodoArbol hijoDerecho;
    private Object dato;

    // Constructor
    public NodoArbol(Object dato) {
        this.dato = dato;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }

    // Getters y Setters
    public NodoArbol getHijoIzquierdo() {
        return this.hijoIzquierdo;
    }

    public void setHijoIzquierdo(NodoArbol hijoIzquierdo) {
        this.hijoIzquierdo = hijoIzquierdo;
    }

    public NodoArbol getHijoDerecho() {
        return this.hijoDerecho;
    }

    public void setHijoDerecho(NodoArbol hijoDerecho) {
        this.hijoDerecho = hijoDerecho;
    }

    public Object getDato() {
        return this.dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    // toString
    @Override
    public String toString() {
        return "Dato: " + this.dato;
    }
}