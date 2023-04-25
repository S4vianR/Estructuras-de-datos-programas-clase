import java.util.InputMismatchException;
import java.util.Scanner;

public class MiTDA<T> {
    T datos[];

    public MiTDA() {
        datos = (T[]) new Object[0];
    }

    public void insertarAlInicio(T dato) throws InputMismatchException {
        T aux[] = (T[]) new Object[datos.length + 1];
        aux[0] = dato;
        System.arraycopy(dato, 0, aux, 1, datos.length);
        datos = aux;
    }

    public void insertarAlFinal(T dato) throws InputMismatchException {
        T aux[] = (T[]) new Object[datos.length + 1];
        System.arraycopy(dato, 0, aux, 0, datos.length);
        aux[datos.length] = dato;
        datos = aux;
    }

    public void insertarEni(T dato, int i) throws InputMismatchException {
        T aux[] = (T[]) new Object[datos.length + 1];
        System.arraycopy(dato, 0, aux, 0, i);
        aux[i] = dato;
        System.arraycopy(dato, i, aux, i + 1, datos.length - i);
        datos = aux;
    }

    public void borrarTodos() {
        datos = (T[]) new Object[datos.length];
    }

    public boolean estaVacia() {
        return datos.length <= 0;
    }

    public int cantidadElementos() {
        return datos.length;
    }

    @Override
    public String toString() {
        if (datos.length <= 0) {
            return "Vacio";
        }
        String datosCadena = "[]";
        for (int i = 0; i < datos.length; i++) {
            datosCadena += datos[i] + " ";
            if (i < datos.length - 1) {
                datosCadena += ", ";
            }
        }
        datosCadena += "]";
        return datosCadena;
    }

    public static void menuInteger() {
        Scanner sc = new Scanner(System.in);
        // Menu de opciones
        MiTDA<Integer> tda = new MiTDA<Integer>();
        int opcion = 0;
        do {
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Insertar en i");
            System.out.println("4. Borrar todos");
            System.out.println("5. Esta vacia");
            System.out.println("6. Cantidad de elementos");
            System.out.println("7. Mostrar datos");
            System.out.println("8. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            try {
            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Dato: ");
                        tda.insertarAlInicio(sc.nextInt());
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Dato: ");
                        tda.insertarAlFinal(sc.nextInt());
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Posicion: ");
                        int posicion = sc.nextInt();
                        System.out.print("Dato: ");
                        tda.insertarEni(sc.nextInt(),posicion);
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    tda.borrarTodos();
                    break;
                case 5:
                    System.out.println(tda.estaVacia());
                    break;
                case 6:
                    System.out.println(tda.cantidadElementos());
                    break;
                case 7:
                    System.out.println(tda.toString());
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while (opcion != 8);
    }

    private static void menuString() {
        Scanner sc = new Scanner(System.in);
        // Menu de opciones
        MiTDA<String> tda = new MiTDA<String>();
        int opcion = 0;
        do {
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Insertar en i");
            System.out.println("4. Borrar todos");
            System.out.println("5. Esta vacia");
            System.out.println("6. Cantidad de elementos");
            System.out.println("7. Mostrar datos");
            System.out.println("8. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Dato: ");
                        tda.insertarAlInicio(sc.next());
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Dato: ");
                        tda.insertarAlFinal(sc.next());
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Posicion: ");
                        int posicion = sc.nextInt();
                        System.out.print("Dato: ");
                        tda.insertarEni(sc.next(), posicion);
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    tda.borrarTodos();
                    break;
                case 5:
                    System.out.println(tda.estaVacia());
                    break;
                case 6:
                    System.out.println(tda.cantidadElementos());
                    break;
                case 7:
                    System.out.println(tda.toString());
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 8);
    }

    private static void menuDouble() {
        Scanner sc = new Scanner(System.in);
        // Menu de opciones
        MiTDA<Double> tda = new MiTDA<Double>();
        int opcion = 0;
        do {
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Insertar en i");
            System.out.println("4. Borrar todos");
            System.out.println("5. Esta vacia");
            System.out.println("6. Cantidad de elementos");
            System.out.println("7. Mostrar datos");
            System.out.println("8. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Dato: ");
                        tda.insertarAlInicio(sc.nextDouble());
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Dato: ");
                        
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Posicion: ");
                        int posicion = sc.nextInt();
                        System.out.print("Dato: ");
                        tda.insertarEni(sc.nextDouble(), posicion);
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    tda.borrarTodos();
                    break;
                case 5:
                    System.out.println(tda.estaVacia());
                    break;
                case 6:
                    System.out.println(tda.cantidadElementos());
                    break;
                case 7:
                    System.out.println(tda.toString());
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 8);
    }

    private static void menuChar() {
        Scanner sc = new Scanner(System.in);
        // Menu de opciones
        MiTDA<Character> tda = new MiTDA<Character>();
        int opcion = 0;
        do {
            System.out.println("1. Insertar al inicio");
            System.out.println("2. Insertar al final");
            System.out.println("3. Insertar en i");
            System.out.println("4. Borrar todos");
            System.out.println("5. Esta vacia");
            System.out.println("6. Cantidad de elementos");
            System.out.println("7. Mostrar datos");
            System.out.println("8. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Dato: ");
                        tda.insertarAlInicio(sc.next().charAt(0));
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.print("Dato: ");
                        tda.insertarAlFinal(sc.next().charAt(0));
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.print("Posicion: ");
                        int posicion = sc.nextInt();
                        System.out.print("Dato: ");
                        tda.insertarEni(sc.next().charAt(0), posicion)
                    } catch (InputMismatchException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    tda.borrarTodos();
                    break;
                case 5:
                    System.out.println(tda.estaVacia());
                    break;
                case 6:
                    System.out.println(tda.cantidadElementos());
                    break;
                case 7:
                    System.out.println(tda.toString());
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcion != 8);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcionTDA;
        do {
            System.out.println("1. Integer\n2. String\n3. Double\n4. Char\n5. Salir");
            System.out.print("Opcion: ");
            opcionTDA = sc.nextInt();
            switch (opcionTDA) {
                case 1:
                    menuInteger();
                    break;
                case 2:
                    menuString();
                    break;
                case 3:
                    menuDouble();
                    break;
                case 4:
                    menuChar();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }
        } while (opcionTDA != 5);
    }
}