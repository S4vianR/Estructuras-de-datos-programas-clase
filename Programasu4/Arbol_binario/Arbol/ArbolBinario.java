package Arbol;

// Import for JOptionPane
import javax.swing.JOptionPane;

public class ArbolBinario {
    // Atributos
    private NodoArbol raiz;

    // Constructor
    public ArbolBinario() {
        this.raiz = null;
    }

    // Getters y Setters
    public NodoArbol getRaiz() {
        return this.raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }

    // Metodos
    public boolean isEmpty() {
        return this.raiz == null;
    }

    // Agregar un nodo al arbol binario
    public void agregarNodo(Object dato) {
        NodoArbol nuevo = new NodoArbol(dato);
        if (raiz == null)
            raiz = nuevo;
        else {
            NodoArbol aux = raiz;
            NodoArbol padre;
            while (true) {
                padre = aux;
                if (dato.toString().compareTo(aux.getDato().toString()) < 0) {
                    aux = aux.getHijoIzquierdo();
                    if (aux == null) {
                        padre.setHijoIzquierdo(nuevo);
                        return;
                    }
                } else {
                    aux = aux.getHijoDerecho();
                    if (aux == null) {
                        padre.setHijoDerecho(nuevo);
                        return;
                    }
                }
            }
        }
    }

    // Imprimir un cierto nivel del arbol binario en orden en un JOptionPane
    public void imprimirNivel(NodoArbol r, int nivel) {
        if (isEmpty()) {// Imprimir el arbol binario en un JOptionPan
            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
        } else {
            String resultado = "";
            NodoArbol aux = r;
            while (aux != null) {
                if (aux.getHijoIzquierdo() == null) {
                    resultado += aux.getDato() + " ";
                    aux = aux.getHijoDerecho();
                } else {
                    NodoArbol predecesor = aux.getHijoIzquierdo();
                    while (predecesor.getHijoDerecho() != null && predecesor.getHijoDerecho() != aux) {
                        predecesor = predecesor.getHijoDerecho();
                    }
                    if (predecesor.getHijoDerecho() == null) {
                        predecesor.setHijoDerecho(aux);
                        aux = aux.getHijoIzquierdo();
                    } else {
                        predecesor.setHijoDerecho(null);
                        resultado += aux.getDato() + " ";
                        aux = aux.getHijoDerecho();
                    }
                }
            }
            JOptionPane.showMessageDialog(null, resultado);
        }
    }

    // Imprimir el arbol binario en orden en un JOptionPane
    public void imprimirEnOrden() {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
        } else {
            String resultado = "";
            NodoArbol aux = this.raiz;
            while (aux != null) {
                if (aux.getHijoIzquierdo() == null) {
                    resultado += aux.getDato() + " ";
                    aux = aux.getHijoDerecho();
                } else {
                    NodoArbol predecesor = aux.getHijoIzquierdo();
                    while (predecesor.getHijoDerecho() != null && predecesor.getHijoDerecho() != aux) {
                        predecesor = predecesor.getHijoDerecho();
                    }
                    if (predecesor.getHijoDerecho() == null) {
                        predecesor.setHijoDerecho(aux);
                        aux = aux.getHijoIzquierdo();
                    } else {
                        predecesor.setHijoDerecho(null);
                        resultado += aux.getDato() + " ";
                        aux = aux.getHijoDerecho();
                    }
                }
            }
            JOptionPane.showMessageDialog(null, resultado);
        }
    }

    // Imprimir el arbol binario en preorden en un JOptionPane
    public void imprimirPreOrden() {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
        } else {
            String resultado = "";
            NodoArbol aux = this.raiz;
            while (aux != null) {
                if (aux.getHijoIzquierdo() == null) {
                    resultado += aux.getDato() + " ";
                    aux = aux.getHijoDerecho();
                } else {
                    NodoArbol predecesor = aux.getHijoIzquierdo();
                    while (predecesor.getHijoDerecho() != null && predecesor.getHijoDerecho() != aux) {
                        predecesor = predecesor.getHijoDerecho();
                    }
                    if (predecesor.getHijoDerecho() == null) {
                        predecesor.setHijoDerecho(aux);
                        resultado += aux.getDato() + " ";
                        aux = aux.getHijoIzquierdo();
                    } else {
                        predecesor.setHijoDerecho(null);
                        aux = aux.getHijoDerecho();
                    }
                }
            }
            JOptionPane.showMessageDialog(null, resultado);
        }
    }

    // Imprimir el arbol binario en postorden en un JOptionPane
    public void imprimirPostOrden() {
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
        } else {
            String resultado = "";
            NodoArbol aux = this.raiz;
            while (aux != null) {
                if (aux.getHijoIzquierdo() == null) {
                    resultado += aux.getDato() + " ";
                    aux = aux.getHijoDerecho();
                } else {
                    NodoArbol predecesor = aux.getHijoIzquierdo();
                    while (predecesor.getHijoDerecho() != null && predecesor.getHijoDerecho() != aux) {
                        predecesor = predecesor.getHijoDerecho();
                    }
                    if (predecesor.getHijoDerecho() == null) {
                        predecesor.setHijoDerecho(aux);
                        aux = aux.getHijoIzquierdo();
                    } else {
                        predecesor.setHijoDerecho(null);
                        resultado += aux.getDato() + " ";
                        aux = aux.getHijoDerecho();
                    }
                }
            }
            JOptionPane.showMessageDialog(null, resultado);
        }
    }

    private void imprime(NodoArbol r, int nivel, StringBuilder arbolString) {
        if (r != null) {
            imprime(r.getHijoDerecho(), nivel + 1, arbolString);
            for (int i = 1; i < nivel; i++) {
                arbolString.append("   ");
            }
            arbolString.append(r.getDato().toString()).append("\n");
            imprime(r.getHijoIzquierdo(), nivel + 1, arbolString);
        }
    }
    
    public void imprime() {
        StringBuilder arbolString = new StringBuilder();
        imprime(this.raiz, 1, arbolString);
        JOptionPane.showMessageDialog(null, arbolString.toString(), "Árbol Binario", JOptionPane.INFORMATION_MESSAGE);
    }    
}
