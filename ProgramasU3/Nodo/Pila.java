import java.util.Scanner;

public class Pila {
    Nodo primero;
    Scanner sc = new Scanner(System.in);

    public Pila() {
        primero = null;
    }

    public void push(int dato) {
        Nodo nuevo = new Nodo(dato);
        nuevo.setSiguiente(primero);
        primero = nuevo;
        System.out.println("Dato ingresado");
    }

    public void pop() {
        if (primero != null) {
            Nodo nuevo = primero;
            primero = primero.getSiguiente();
            nuevo.setSiguiente(null);
            System.out.println("Dato eliminado");
        } else {
            System.out.println("No hay datos, la pila esta vacia");
        }
    }

    public void buscarNodo() {
        int datoBuscado;
        Nodo actual = new Nodo();
        actual = primero;
        boolean encontrado = false;
        if (primero != null) {
            System.out.println("Ingrese el dato a buscar");
            datoBuscado = sc.nextInt();
            while (actual != null && encontrado != true) {
                if (actual.getDato() == datoBuscado) {
                    encontrado = true;
                }
                actual = actual.getSiguiente();
            }
            if (encontrado == true) {
                System.out.println("El dato se encuentra en la pila");
            } else {
                System.out.println("El dato no se encuentra en la pila");
            }
        } else {
            System.out.println("No hay datos, la pila esta vacia");
        }
    }

    public void modificarNodo() {
        int datoBuscado, nuevoDato;
        Nodo actual = new Nodo();
        actual = primero;
        boolean encontrado = false;
        if (primero != null) {
            System.out.println("Ingrese el dato a modificar");
            datoBuscado = sc.nextInt();
            while (actual != null && encontrado != true) {
                if (actual.getDato() == datoBuscado) {
                    encontrado = true;
                }
                actual = actual.getSiguiente();
            }
            if (encontrado == true) {
                System.out.println("El dato " + actual.dato + " se encuentra en la pila");
                System.out.println("Ingrese el nuevo dato");
                nuevoDato = sc.nextInt();
                actual.setDato(nuevoDato);
                System.out.println("Dato modificado");
            } else {
                System.out.println("El dato no se encuentra en la pila");
            }
        } else {
            System.out.println("No hay datos, la pila esta vacia");
        }
    }

    public void eliminarNodo() {
        int datoBuscado;
        Nodo actual = new Nodo();
        actual = primero;
        Nodo anterior = null;
        boolean encontrado = false;
        if (primero != null) {
            System.out.println("Ingrese el dato a eliminar");
            datoBuscado = sc.nextInt();
            while (actual != null && encontrado != true) {
                if (actual.getDato() == datoBuscado) {
                    encontrado = true;
                }
                anterior = actual;
                actual = actual.getSiguiente();
            }
            if (encontrado == true) {
                if (actual == primero) {
                    primero = primero.getSiguiente();
                } else {
                    anterior.setSiguiente(actual.getSiguiente());
                }
                System.out.println("Dato eliminado");
            } else {
                System.out.println("El dato no se encuentra en la pila");
            }
        } else {
            System.out.println("No hay datos, la pila esta vacia");
        }
    }

    @Override
    public String toString() {
        String cadena = "";
        Nodo actual = new Nodo();
        actual = primero;
        if (primero != null) {
            while (actual != null) {
                cadena = cadena + "[" + actual.getDato() + "]";
                actual = actual.getSiguiente();
            }
        } else {
            cadena = "No hay datos, la pila esta vacia";
        }
        return cadena;
    }
}