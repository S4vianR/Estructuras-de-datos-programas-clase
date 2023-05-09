/*
 * Metodos a implementar:
 * 1. Agregar un nodo
 * 2. Recorrer el arbol en order
 * 3. Recorrer el arbol en preorden
 * 4. Recorrer el arbol en postorden
 * 5. Buscar un nodo en el arbol
 * 6. Eliminar un nodo del arbol
 * 7. Salir
 */

// Package
package arbolbinario;

// Import
import arbolbinario.*;

// Import JOptionPane
import javax.swing.JOptionPane;

// Clase ArbolBinario
public class ArbolBinario {
    // Atributos
    private NodoArbol raiz;

    // Constructor
    public ArbolBinario() {
        raiz = null;
    }

    // Metodos
    // 1: Metodo para agregar un nodo al arbol usando Comparable
    // Metodo recursivo
    public void agregarNodo(Object dato) {
        raiz = agregarNodo(dato, raiz);
    }

    public NodoArbol agregarNodo(Object dato, NodoArbol raiz) {
        // Si el arbol esta vacio
        if (raiz == null) {
            // Crear un nuevo nodo
            raiz = new NodoArbol(dato);
        } else {
            // Si el dato es menor que la raiz
            if (((Comparable) dato).compareTo(raiz.getDato()) < 0) {
                // Agregar el dato al subarbol izquierdo
                raiz.setIzquierdo(agregarNodo(dato, raiz.getIzquierdo()));
            } else {
                // Agregar el dato al subarbol derecho
                raiz.setDerecho(agregarNodo(dato, raiz.getDerecho()));
            }
        }
        return raiz;
    }

    // 2: Metodo para recorrer el arbol en orden (izquierda, raiz, derecha) con
    // JOptionPane
    public void recorrerEnOrden(NodoArbol raiz) {
        // Si el arbol no esta vacio
        if (raiz != null) {
            // Recorrer el subarbol izquierdo
            recorrerEnOrden(raiz.getIzquierdo());
            // Visitar la raiz
            JOptionPane.showMessageDialog(null, raiz.getDato());
            // Recorrer el subarbol derecho
            recorrerEnOrden(raiz.getDerecho());
        }
    }

    // 3: Metodo para recorrer el arbol en preorden (raiz, izquierda, derecha) con
    // JOptionPane
    public void recorrerEnPreorden(NodoArbol raiz) {
        // Si el arbol no esta vacio
        if (raiz != null) {
            // Visitar la raiz
            JOptionPane.showMessageDialog(null, raiz.getDato());
            // Recorrer el subarbol izquierdo
            recorrerEnPreorden(raiz.getIzquierdo());
            // Recorrer el subarbol derecho
            recorrerEnPreorden(raiz.getDerecho());
        }
    }

    // 4: Metodo para recorrer el arbol en postorden (izquierda, derecha, raiz) con
    // JOptionPane
    public void recorrerEnPostorden(NodoArbol raiz) {
        // Si el arbol no esta vacio
        if (raiz != null) {
            // Recorrer el subarbol izquierdo
            recorrerEnPostorden(raiz.getIzquierdo());
            // Recorrer el subarbol derecho
            recorrerEnPostorden(raiz.getDerecho());
            // Visitar la raiz
            JOptionPane.showMessageDialog(null, raiz.getDato());
        }
    }

    // 5: Metodo para buscar un nodo en el arbol binario (metodo recursivo)
    // Metodo recursivo de buscar nodo
    public NodoArbol buscarNodo(Object dato) {
        NodoArbol aux = buscarNodo(raiz, dato);
        return aux;
    }

    public NodoArbol buscarNodo(NodoArbol raiz, Object dato) {
        // Si el arbol esta vacio
        if (raiz == null) {
            // Retornar nulo
            return null;
        } else {
            // Si el arbol no esta vacio
            // Si el dato del nodo raiz es igual al dato buscado
            if (raiz.getDato().toString().compareTo(dato.toString()) == 0) {
                // Retornar el nodo raiz
                return raiz;
            } else {
                // Si el dato del nodo raiz es menor al dato buscado
                if (raiz.getDato().toString().compareTo(dato.toString()) < 0) {
                    // Retornar el metodo buscarNodo con el nodo derecho y el dato buscado
                    return buscarNodo(raiz.getDerecho(), dato);
                } else {
                    // Si el dato del nodo raiz es mayor al dato buscado
                    // Retornar el metodo buscarNodo con el nodo izquierdo y el dato buscado
                    return buscarNodo(raiz.getIzquierdo(), dato);
                }
            }
        }
    }

    // 6: Metodo para eliminar un nodo del arbol binario (metodo no recursivo)
    

    // Getters y Setters
    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }
}