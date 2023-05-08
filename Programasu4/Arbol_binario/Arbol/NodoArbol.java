// Crear una clase ArbolBinario que contenga un hijo izquierdo, un hijo derecho del tipo NodoArbol y dato.
package Arbol;

//JOp
import javax.swing.JOptionPane;

public class NodoArbol {
    // Atributos
    private NodoArbol hijoIzquierdo;
    private NodoArbol hijoDerecho;
    private int dato;

    // Constructor
    public NodoArbol(int dato) {
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

    public int getDato() {
        return this.dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    // Metodos
    public void insertar (int valor){
        if (valor < this.dato){
            if (this.hijoIzquierdo == null){
                this.hijoIzquierdo = new NodoArbol(valor);
            } else {
                this.hijoIzquierdo.insertar(valor);
            }
        } else if (valor > this.dato){
            if (this.hijoDerecho == null){
                this.hijoDerecho = new NodoArbol(valor);
            } else {
                this.hijoDerecho.insertar(valor);
            }
        } else {
            JOptionPane.showMessageDialog(null, "El valor ya existe en el arbol");
        }
    }

    // toString
    @Override
    public String toString() {
        return "Dato: " + this.dato;
    }
}