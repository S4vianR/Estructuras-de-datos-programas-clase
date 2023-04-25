package fila;

// Reuben Rhienhart 20112048
import javax.swing.JOptionPane;

public class Fila {
    // Clase generica de fila
    private int max;
    private int frente;
    private int fin;
    private Object[] listaFila;

    public Fila(int max) {
        this.max = max;
        frente = -1;
        fin = -1;
        listaFila = new Object[max];
    }

    // isEmpty
    public boolean isEmpty() {
        return (frente == -1 && fin == -1);
    }

    // isFull
    public boolean isFull() {
        return (fin == max - 1);
    }

    // insert
    public void insert(Object item) {
        if (isFull()) {
            JOptionPane.showMessageDialog(null, "La fila esta llena");
        } else {
            if (isEmpty()) {
                frente = 0;
            }
            fin++;
            listaFila[fin] = item;
        }
    }

    // remove
    public Object remove() {
        Object item = null;
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "La fila esta vacia");
        } else {
            item = listaFila[frente];
            if (frente == fin) {
                frente = -1;
                fin = -1;
            } else {
                for (int i = 0; i < fin; i++) {
                    listaFila[i] = listaFila[i + 1];
                }
                fin--;
            }
        }
        return item;
    }

    // peek
    public Object peek() {
        Object item = null;
        if (isEmpty()) {
            JOptionPane.showMessageDialog(null, "La fila esta vacia");
        } else {
            item = listaFila[frente];
        }
        return item;
    }

    // toString
    @Override
    public String toString() {
        String s = "[";
        if (isEmpty()) {
            s = "La fila esta vacia";
        } else {
            for (int i = frente; i <= fin; i++) {
                if (i == fin) {
                    s += listaFila[i];
                } else {
                    s += listaFila[i] + ", ";
                }
            }
        }
        if (!isEmpty()) {
            s += "]";
        }
        return s;
    }
}