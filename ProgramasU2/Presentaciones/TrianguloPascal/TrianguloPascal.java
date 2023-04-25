import java.util.Scanner;

public class TrianguloPascal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de filas a imprimir: ");
        int filas = sc.nextInt();
        System.out.println("Triangulo de Pascal");
        mostrar(filas);

    }

    private static void mostrar(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.println(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int pascal(int i, int j) {
        if (j == 0 || j == i) {
            return 1;
        } else {
            return pascal(i - 1, j - 1) + pascal(i - 1, j);
        }
    }
}