
// Curvas de hilbert
// Imports
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hilbert {

    // Metodo para calcular las lineas que tiene la curva de hilbert
    public static int CurvaHilbert(int n) {
        if (n == 0)
            return 3;
        else {
            int aux = 1;
            if (n % 2 == 0)
                aux = -1;
            return (CurvaHilbert(n - 1) * 4) + aux;
        }
    }

    public static void main(String[] args) {
        // Try y catch para capturar un numero
        try (// Scanner
                Scanner s1 = new Scanner(System.in)) {
            System.out.println("\nCuantos niveles quiere en fractal de curvas de hilbert:");
            int niv = s1.nextInt();
            System.out.println("El nivel " + niv + " tiene " + CurvaHilbert(niv) + " lineas");
        }

        catch (InputMismatchException e) {
            System.out.println("Error: ");
            e.printStackTrace();
        }

        // Finally 
        finally {
            System.out.println("Programa finalizado");
        }

    }
}
