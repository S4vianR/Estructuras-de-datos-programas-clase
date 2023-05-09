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
    public Object agregarNodo(Object dato) {
        /*
         * // Crear un nuevo nodo
         * NodoArbol nuevo = new NodoArbol(dato);
         * // Si el arbol esta vacio
         * if (raiz == null) {
         * // El nuevo nodo sera la raiz
         * raiz = nuevo;
         * } else {
         * // Si el arbol no esta vacio
         * // Crear un nodo auxiliar
         * NodoArbol aux = raiz;
         * // Crear un nodo padre
         * NodoArbol padre;
         * // Mientras el nodo auxiliar no sea nulo
         * while (aux != null) {
         * // El padre sera el nodo auxiliar
         * padre = aux;
         * // Si el dato del nuevo nodo es menor al dato del nodo auxiliar
         * if (nuevo.getDato().toString().compareTo(aux.getDato().toString()) < 0) {
         * // El nodo auxiliar sera el nodo izquierdo
         * aux = aux.getIzquierdo();
         * // Si el nodo auxiliar es nulo
         * if (aux == null) {
         * // El nodo izquierdo del padre sera el nuevo nodo
         * padre.setIzquierdo(nuevo);
         * }
         * } else {
         * // Si el dato del nuevo nodo es mayor al dato del nodo auxiliar
         * // El nodo auxiliar sera el nodo derecho
         * aux = aux.getDerecho();
         * // Si el nodo auxiliar es nulo
         * if (aux == null) {
         * // El nodo derecho del padre sera el nuevo nodo
         * padre.setDerecho(nuevo);
         * }
         * }
         * }
         */

        // Crear un nuevo nodo
        NodoArbol nuevo = new NodoArbol(dato);
        // Si el arbol esta vacio
        if (raiz == null) {
            // El nuevo nodo sera la raiz
            raiz = nuevo;
        } else {
            // Si el arbol no esta vacio
            // Crear un nodo auxiliar
            NodoArbol aux = raiz;
            // Crear un nodo padre
            NodoArbol padre;
            // Mientras el nodo auxiliar no sea nulo
            while (aux != null) {
                // El padre sera el nodo auxiliar
                padre = aux;
                // Si el dato del nuevo nodo es menor al dato del nodo auxiliar
                if (((Comparable) nuevo.getDato()).compareTo(aux.getDato()) < 0) {
                    // El nodo auxiliar sera el nodo izquierdo
                    aux = aux.getIzquierdo();
                    // Si el nodo auxiliar es nulo
                    if (aux == null) {
                        // El nodo izquierdo del padre sera el nuevo nodo
                        padre.setIzquierdo(nuevo);
                    }
                } else {
                    // Si el dato del nuevo nodo es mayor al dato del nodo auxiliar
                    // El nodo auxiliar sera el nodo derecho
                    aux = aux.getDerecho();
                    // Si el nodo auxiliar es nulo
                    if (aux == null) {
                        // El nodo derecho del padre sera el nuevo nodo
                        padre.setDerecho(nuevo);
                    }
                }
            }
        }
        // Retornar el nuevo nodo
        return nuevo;
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
    public Object buscarNodo(NodoArbol raiz, Object dato) {
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

    // 6: Metodo para eliminar un nodo del arbol
    public void eliminarNodo(Object dato) {
        // Crear un nodo auxiliar
        NodoArbol aux = raiz;
        // Crear un nodo padre
        NodoArbol padre = raiz;
        // Crear un booleano para saber si el nodo es izquierdo o derecho
        boolean esIzquierdo = true;
        // Mientras el dato del nodo auxiliar no sea igual al dato buscado
        while (aux.getDato().toString().compareTo(dato.toString()) != 0) {
            // El padre sera el nodo auxiliar
            padre = aux;
            // Si el dato del nodo auxiliar es menor al dato buscado
            if (aux.getDato().toString().compareTo(dato.toString()) < 0) {
                // El nodo auxiliar sera el nodo derecho
                esIzquierdo = false;
                aux = aux.getDerecho();
            } else {
                // Si el dato del nodo auxiliar es mayor al dato buscado
                // El nodo auxiliar sera el nodo izquierdo
                esIzquierdo = true;
                aux = aux.getIzquierdo();
            }
            // Si el nodo auxiliar es nulo
            if (aux == null) {
                // Mostrar mensaje
                JOptionPane.showMessageDialog(null, "Nodo no encontrado");
                // Salir del metodo
                return;
            }
        }
    }

    // Getters y Setters
    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }
}