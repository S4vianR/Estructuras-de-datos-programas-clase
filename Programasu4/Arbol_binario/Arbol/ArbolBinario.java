package Arbol;

//Import for JOptionPane
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

    // Metodos
    public boolean isEmpty() {
        return this.raiz == null;
    }

    public void agregarNodo (int valor){
        if (isEmpty()){
            this.raiz = new NodoArbol(valor);
        } else {
            this.raiz.insertar(valor);
        }
    }

    // Imprimir el arbol binario en orden en un JOptionPane sin recursividad
    public void imprimirEnOrden(){
        if (isEmpty()){
            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
        } else {
            String resultado = "";
            NodoArbol aux = this.raiz;
            while (aux != null){
                if (aux.getHijoIzquierdo() == null){
                    resultado += aux.getDato() + " ";
                    aux = aux.getHijoDerecho();
                } else {
                    NodoArbol predecesor = aux.getHijoIzquierdo();
                    while (predecesor.getHijoDerecho() != null && predecesor.getHijoDerecho() != aux){
                        predecesor = predecesor.getHijoDerecho();
                    }
                    if (predecesor.getHijoDerecho() == null){
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

    // Imprimir un cierto nivel del arbol binario en orden en un JOptionPane sin recursividad
    public void imprimirNivel(NodoArbol r, int nivel){
        if (isEmpty()){
            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
        } else {
            String resultado = "";
            NodoArbol aux = r;
            while (aux != null){
                if (aux.getHijoIzquierdo() == null){
                    resultado += aux.getDato() + " ";
                    aux = aux.getHijoDerecho();
                } else {
                    NodoArbol predecesor = aux.getHijoIzquierdo();
                    while (predecesor.getHijoDerecho() != null && predecesor.getHijoDerecho() != aux){
                        predecesor = predecesor.getHijoDerecho();
                    }
                    if (predecesor.getHijoDerecho() == null){
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
}
