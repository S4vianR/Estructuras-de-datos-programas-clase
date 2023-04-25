import java.util.InputMismatchException;
import java.util.Scanner;

public class MiTDA<T> {
    T datos[];

    public MiTDA() {
        datos = (T[]) new Object[0];
    }

    // Agrega un elemento al inicio del arreglo usando arraycopy
    public void InsertarAlInicio(T dato) {
        T[] aux = (T[]) new Object[datos.length + 1];
        System.arraycopy(datos, 0, aux, 1, datos.length);
        aux[0] = dato;
        datos = aux;
    }

    // Agrega un elemento al final del arreglo usando arraycopy
    public void InsertarAlFinal(T dato) {
        T[] aux = (T[]) new Object[datos.length + 1];
        System.arraycopy(datos, 0, aux, 0, datos.length);
        aux[datos.length] = dato;
        datos = aux;
    }

    // Agrega un elemento en la posición indicada usando arraycopy
    public void InsertarEnPos(int pos, T dato) {
        T[] aux = (T[]) new Object[datos.length + 1];
        System.arraycopy(datos, 0, aux, 0, pos);
        aux[pos] = dato;
        System.arraycopy(datos, pos, aux, pos + 1, datos.length - pos);
        datos = aux;
    }

    // Borrar todos los elementos del arreglo
    public void clear() {
        datos = (T[]) new Object[0];
        System.out.println();
    }

    // Comprobar si esta vacio
    public boolean isEmpty() {
        return datos.length <= 0;
    }

    // Mostrar cuantos elementos hay en el arreglo
    public int size() {
        return datos.length;
    }

    // ToString
    @Override
    public String toString() {
        if (datos.length <= 0) {
            return "Vacio";
        }
        String datosCadena = "[";
        for (int i = 0; i < datos.length; i++) {
            datosCadena += datos[i] + " ";
            if (i < datos.length - 1) {
                datosCadena += ", ";
            }
        }
        datosCadena += "]";
        return datosCadena;
    }

    public static void menuIntegers() {
        MiTDA<Integer> tda = new MiTDA<Integer>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean continuar = false;
        do {
            System.out.println("\n");
            System.out.println("1. Agregar al inicio");
            System.out.println("2. Agregar al final");
            System.out.println("3. Agregar en posición");
            System.out.println("4. Borrar todos los elementos");
            System.out.println("5. Mostrar si esta vacio");
            System.out.println("6. Mostrar cuantos elementos hay");
            System.out.println("7. Mostrar todos los elementos");
            System.out.println("8. Salir");
            System.out.print("Opcion: ");
            do {
                try {
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.print("Dato para insertar al principio: ");
                            tda.InsertarAlInicio(sc.nextInt());
                            break;
                        case 2:
                            System.out.print("Dato para insertar al final: ");
                            tda.InsertarAlFinal(sc.nextInt());
                            break;
                        case 3:
                            System.out.print("Posición: ");
                            int pos = sc.nextInt();
                            System.out.print("Dato para insertar en la posicion " + pos + ": ");
                            tda.InsertarEnPos(pos, sc.nextInt());
                            break;
                        case 4:
                            tda.clear();
                            break;
                        case 5:
                            System.out.println(tda.isEmpty());
                            break;
                        case 6:
                            System.out.println(tda.size());
                            break;
                        case 7:
                            System.out.println(tda);
                            break;
                        case 8:
                            System.out.println("Adios");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    continuar = true;
                } catch (InputMismatchException e) {
                    System.err.println("Opcion no valida");
                    System.out.println("Intenta de nuevo, solo acepto numeros enteros:");
                    sc.nextLine();
                    continuar = false;
                }
            } while (continuar == false);
        } while (opcion != 8);
    }

    public static void menuString() {
        MiTDA<String> tda = new MiTDA<String>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean continuar = false;
        do {
            System.out.println("\n");
            System.out.println("1. Agregar al inicio");
            System.out.println("2. Agregar al final");
            System.out.println("3. Agregar en posición");
            System.out.println("4. Borrar todos los elementos");
            System.out.println("5. Mostrar si esta vacio");
            System.out.println("6. Mostrar cuantos elementos hay");
            System.out.println("7. Mostrar todos los elementos");
            System.out.println("8. Salir");
            System.out.print("Opcion: ");
            do {
                try {
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.print("Dato para insertar al principio: ");
                            tda.InsertarAlInicio(sc.next());
                            break;
                        case 2:
                            System.out.print("Dato para insertar al final: ");
                            tda.InsertarAlFinal(sc.next());
                            break;
                        case 3:
                            System.out.print("Posición: ");
                            int pos = sc.nextInt();
                            System.out.print("Dato para insertar en la posicion " + pos + ": ");
                            tda.InsertarEnPos(pos, sc.next());
                            break;
                        case 4:
                            tda.clear();
                            break;
                        case 5:
                            System.out.println(tda.isEmpty());
                            break;
                        case 6:
                            System.out.println(tda.size());
                            break;
                        case 7:
                            System.out.println(tda);
                            break;
                        case 8:
                            System.out.println("Adios");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    continuar = true;
                } catch (InputMismatchException e) {
                    System.err.println("Opcion no valida");
                    System.out.println("Intenta de nuevo, solo acepto palabras:");
                    sc.nextLine();
                    continuar = false;
                }
            } while (continuar == false);
        } while (opcion != 8);
    }

    public static void menuDouble() {
        MiTDA<Double> tda = new MiTDA<Double>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean continuar = false;
        do {
            System.out.println("\n");
            System.out.println("1. Agregar al inicio");
            System.out.println("2. Agregar al final");
            System.out.println("3. Agregar en posición");
            System.out.println("4. Borrar todos los elementos");
            System.out.println("5. Mostrar si esta vacio");
            System.out.println("6. Mostrar cuantos elementos hay");
            System.out.println("7. Mostrar todos los elementos");
            System.out.println("8. Salir");
            System.out.print("Opcion: ");
            do {
                try {
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.print("Dato para insertar al principio: ");
                            tda.InsertarAlInicio(sc.nextDouble());
                            break;
                        case 2:
                            System.out.print("Dato para insertar al final: ");
                            tda.InsertarAlFinal(sc.nextDouble());
                            break;
                        case 3:
                            System.out.print("Posición: ");
                            int pos = sc.nextInt();
                            System.out.print("Dato para insertar en la posicion " + pos + ": ");
                            tda.InsertarEnPos(pos, sc.nextDouble());
                            break;
                        case 4:
                            tda.clear();
                            break;
                        case 5:
                            System.out.println(tda.isEmpty());
                            break;
                        case 6:
                            System.out.println(tda.size());
                            break;
                        case 7:
                            System.out.println(tda);
                            break;
                        case 8:
                            System.out.println("Adios");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    continuar = true;
                } catch (InputMismatchException e) {
                    System.err.println("Opcion no valida");
                    System.out.println("Intenta de nuevo, solo acepto numeros decimales:");
                    sc.nextLine();
                    continuar = false;
                }
            } while (continuar == false);
        } while (opcion != 8);
    }

    public static void menuChar() {
        MiTDA<Character> tda = new MiTDA<Character>();
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean continuar = false;
        do {
            System.out.println("\n");
            System.out.println("1. Agregar al inicio");
            System.out.println("2. Agregar al final");
            System.out.println("3. Agregar en posición");
            System.out.println("4. Borrar todos los elementos");
            System.out.println("5. Mostrar si esta vacio");
            System.out.println("6. Mostrar cuantos elementos hay");
            System.out.println("7. Mostrar todos los elementos");
            System.out.println("8. Salir");
            System.out.print("Opcion: ");
            do {
                try {
                    opcion = sc.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.print("Dato para insertar al principio: ");
                            tda.InsertarAlInicio(sc.next().charAt(0));
                            break;
                        case 2:
                            System.out.print("Dato para insertar al final: ");
                            tda.InsertarAlFinal(sc.next().charAt(0));
                            break;
                        case 3:
                            System.out.print("Posición: ");
                            int pos = sc.nextInt();
                            System.out.print("Dato para insertar en la posicion " + pos + ": ");
                            tda.InsertarEnPos(pos, sc.next().charAt(0));
                            break;
                        case 4:
                            tda.clear();
                            break;
                        case 5:
                            System.out.println(tda.isEmpty());
                            break;
                        case 6:
                            System.out.println(tda.size());
                            break;
                        case 7:
                            System.out.println(tda);
                            break;
                        case 8:
                            System.out.println("Adios");
                            break;
                        default:
                            System.out.println("Opcion no valida");
                            break;
                    }
                    continuar = true;
                } catch (InputMismatchException e) {
                    System.err.println("Opcion no valida");
                    System.out.println("Intenta de nuevo, solo acepto una sola letra:");
                    sc.nextLine();
                    continuar = false;
                }
            } while (continuar == false);
        } while (opcion != 8);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        boolean continuar = false;
        System.out.println("\n");
        System.out.println("1. Integers");
        System.out.println("2. Strings");
        System.out.println("3. Doubles");
        System.out.println("4. Caracteres");
        System.out.println("5. Salir");
        System.out.print("Opcion: ");
        do {
            try {
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        menuIntegers();
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
                        System.out.println("Adios");
                        break;
                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
                continuar = true;
            } catch (InputMismatchException e) {
                System.err.println("Opcion no valida");
                System.out.println("Intenta de nuevo, solo acepto numeros:");
                sc.nextLine();
                continuar = false;
            }
        } while (continuar == false);
    }
}