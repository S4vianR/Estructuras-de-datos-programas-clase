public class pila {
    private int[] pila;
    private int cima;
    private int tamano;

    public pila(int tamano) {
        this.tamano = tamano;
        pila = new int[tamano];
        cima = -1;
    }

    // Exceptiones
    public void push(int elemento) throws Exception {
        if (cima < tamano - 1) {
            cima++;
            pila[cima] = elemento;
        } else {
            throw new Exception("La pila esta llena");
        }
    }

    public int pop() throws Exception {
        if (cima >= 0) {
            int elemento = pila[cima];
            cima--;
            return elemento;
        } else {
            throw new Exception("La pila esta vacia");
        }
    }

    public int cima() throws Exception {
        if (cima >= 0) {
            return pila[cima];
        } else {
            throw new Exception("La pila esta vacia");
        }
    }

    public boolean vacia() {
        return cima == -1;
    }

    public boolean llena() {
        return cima == tamano - 1;
    }

    /*
     * Mostrar
     * public void mostrar() {
     * System.out.print("Pila: {");
     * for (int i = cima; i >= 0; i--) {
     * System.out.print(pila[i] + ",");
     * }
     * System.out.println("}\n");
     * }
     */

    // toString con salto de linea para la pila
    @Override
    public String toString() {
        String cadena = "Pila: \n{\n";
        for (int i = cima; i >= 0; i--) {
            cadena += "  " + +pila[i] + ",\n";
        }
        cadena += "}";
        return cadena;
    }
}