import java.util.Arrays;
import java.util.Random;

// Reuben Rhienhart 20112048
public class Analisis {
    public static void main(String[] args) {
        System.out.println("Analisis de algoritmos");
        System.out.println("\nMedir busca mayor");
        medirBuscaMayor();
        System.out.println("\nMedir sum10n");
        medirSum10n();
        System.out.println("\nMedir sumNCuad");
        medirSumNCuad();
        System.out.println("\nMedir ordenar");
        medirOrdenar();
        System.out.println("\nMedir mostrarArreglo");
        medirArraysSort();
    }

    // Metodo para buscar el mayor de un arreglo
    private static int buscaMayor(int arreglo[]) {
        int mayor = Integer.MIN_VALUE;
        for (int i = 1; i < arreglo.length; i++) {
            if (arreglo[i] > mayor) {
                mayor = arreglo[i];
            }
        }
        return mayor;
    }

    // Sumar un dato en un ciclo anidado (10 y n)
    private static long sum10n(int n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                sum++;
            }
        }
        return sum;
    }

    // Sumar un dato en un ciclo anidado (n y n)
    private static long sumNCuad(int n) {
        long sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum++;
            }
        }
        return sum;
    }

    // Metodo para generar arreglo de enteros aleatorios
    private static int[] generarArreglo(int n, int li, int ls) {
        int a[] = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt(ls - li + 1) + li;
        }
        return a;
    }

    // Metodo para ordenar un arreglo
    private static void ordenar(int n[]) {
        for (int i = 0; i < n.length - 1; i++) {
            for (int j = 0; j < n.length - 1; j++) {
                if (n[j] > n[j + 1]) {
                    int temp = n[j];
                    n[j] = n[j + 1];
                    n[j + 1] = temp;
                }
            }
        }
    }

    // Metodo para mostrar un arreglo
    private static void mostrarArreglo(int n[]) {
        System.out.println("Arreglo:");
        for (int i = 0; i < n.length; i++) {
            System.out.print("[" + n[i] + "], ");
        }
    }

    // Metodo para medir eficiencia del metodo buscaMayor
    private static void medirBuscaMayor() {
        int n = 1000000;
        int a[] = generarArreglo(n, 100, 1000000);
        long t1 = System.currentTimeMillis();
        int res = buscaMayor(a);
        long t2 = System.currentTimeMillis();
        System.out.println("El mayor es: " + res);
        System.out.println("Y el tiempo fue de: " + (t2 - t1) + " ms");
    }

    // Metodo para medir eficiencia del metodo sum10n
    private static void medirSum10n() {
        int n = 1000000;
        long t1 = System.currentTimeMillis();
        long res = sum10n(n);
        long t2 = System.currentTimeMillis();
        System.out.println("La suma es: " + res);
        System.out.println("Y el tiempo fue de: " + (t2 - t1) + " ms");
    }

    // Metodo para medir eficiencia del metodo sumNCuad
    private static void medirSumNCuad() {
        int n = 1000000;
        long t1 = System.currentTimeMillis();
        long res = sumNCuad(n);
        long t2 = System.currentTimeMillis();
        System.out.println("La suma es: " + res);
        System.out.println("Y el tiempo fue de: " + (t2 - t1) + " ms");
    }

    // Metodo para medir eficiencia del metodo ordenar
    private static void medirOrdenar() {
        int n = 1000;
        int a[] = generarArreglo(n, 100, 10000);
        long t1 = System.currentTimeMillis();
        ordenar(a);
        long t2 = System.currentTimeMillis();
        System.out.println("El tiempo fue de: " + (t2 - t1) + " ms");
    }

    // Metodo para medir eficiencia del metodo mostrarArreglo
    private static void medirMostrarArreglo() {
        int n = 1000;
        int a[] = generarArreglo(n, 100, 10000);
        long t1 = System.currentTimeMillis();
        mostrarArreglo(a);
        long t2 = System.currentTimeMillis();
        System.out.println("El tiempo fue de: " + (t2 - t1) + " ms");
    }

    // Metodo para medir eficiencia del metodo Arrays.sort
    private static void medirArraysSort() {
        int n = 1000;
        int a[] = generarArreglo(n, 100, 10000);
        long t1 = System.currentTimeMillis();
        Arrays.sort(a);
        long t2 = System.currentTimeMillis();
        System.out.println("El tiempo fue de: " + (t2 - t1) + " ms");
    }
}