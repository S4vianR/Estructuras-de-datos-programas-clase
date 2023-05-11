package arbol;

// Import for JavaOptionPane
import javax.swing.JOptionPane;

public class ArbolBinario {
    // Atributos
    NodoArbol raiz;

    // Constructor
    public ArbolBinario() {
        raiz = null;
    }

    // Métodos

    // isEmpty
    public boolean isEmpty() {
        return raiz == null;
    }

    // Insertar
    public void insertar(Object dato) {
        raiz = insertar(raiz, dato);
    }

    public NodoArbol insertar(NodoArbol r, Object obj) {
        if (r == null)
            r = new NodoArbol(obj);
        else {
            if (((Comparable) r.dato).compareTo((Comparable) obj) < 0)
                r.hijoIzquierdo = insertar(r.hijoIzquierdo, obj);
            else
                r.hijoDerecho = insertar(r.hijoDerecho, obj);
        }
        return r;
    }

    // Buscar
    public NodoArbol buscar(Object dato) {
        NodoArbol aux = buscar(raiz, dato);
        return aux;
    }

    public NodoArbol buscar(NodoArbol aux, Object obj) {
        if (aux != null) {
            if (((Comparable) obj).compareTo(aux.dato) < 0)
                return buscar(aux.hijoIzquierdo, obj);
            else if (((Comparable) obj).compareTo(aux.dato) > 0)
                return buscar(aux.hijoDerecho, obj);
            else
                return aux;
        } else
            return null;
    }

    // Eliminar
    public void eliminar(Object dato) {
        raiz = eliminar(raiz, dato);
    }

    public NodoArbol eliminar(NodoArbol r, Object obj) {
        if (r == null)
            return null;
        // Si el dato a eliminar es menor al dato del nodo actual, se procede a buscar
        if (((Comparable) obj).compareTo(r.dato) < 0)
            r.hijoIzquierdo = eliminar(r.hijoIzquierdo, obj);
        // Si el dato a eliminar es mayor al dato del nodo actual, se procede a buscar
        else if (((Comparable) obj).compareTo(r.dato) > 0)
            r.hijoDerecho = eliminar(r.hijoDerecho, obj);
        // Si el dato a eliminar es igual al dato del nodo actual, se procede a eliminar
        else {
            // Si el nodo actual no tiene hijos, se elimina
            if (r.hijoDerecho == null)
                r = r.hijoIzquierdo;
            else if (r.hijoIzquierdo == null)
                r = r.hijoDerecho;
            // Si el nodo actual tiene dos hijos, se busca el menor de los mayores
            else
                r.hijoIzquierdo = eliminar(r, r.hijoIzquierdo);
        }
        return r;
    }

    // Recorridos
    // Preorden
    public void preorden() {
        preorden(raiz);
    }

    public void preorden(NodoArbol r) {
        if (r != null) {
            JOptionPane.showMessageDialog(null, r.dato, "Preorden", JOptionPane.INFORMATION_MESSAGE);
            preorden(r.hijoIzquierdo);
            preorden(r.hijoDerecho);
        }
    }

    // Inorden
    public void inorden() {
        inorden(raiz);
    }

    public void inorden(NodoArbol r) {
        if (r != null) {
            inorden(r.hijoIzquierdo);
            JOptionPane.showMessageDialog(null, r.dato, "Inorden", JOptionPane.INFORMATION_MESSAGE);
            inorden(r.hijoDerecho);
        }
    }

    // Postorden
    public void postorden() {
        postorden(raiz);
    }

    public void postorden(NodoArbol r) {
        if (r != null) {
            postorden(r.hijoIzquierdo);
            postorden(r.hijoDerecho);
            JOptionPane.showMessageDialog(null, r.dato, "Postorden", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Getters y Setters
    public NodoArbol getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoArbol raiz) {
        this.raiz = raiz;
    }

    // toString
    public String toString() {
        return toString(raiz);
    }

    public String toString(NodoArbol r) {
        String s = "";
        if (r != null) {
            s += r.dato + " ";
            s += toString(r.hijoIzquierdo);
            s += toString(r.hijoDerecho);
        }
        return s;
    }

}
