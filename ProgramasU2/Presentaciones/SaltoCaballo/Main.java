import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int x, y;
        boolean solucion;
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Posicion inicial");
            System.out.print("x = ");
            x = Integer.parseInt(entrada.readLine());
            System.out.print("y = ");
            y = Integer.parseInt(entrada.readLine());
            Salto_Caballo caballo = new Salto_Caballo(x, y);
            caballo.escribirTablero();
            System.out.println();
            solucion = caballo.resolverProblema();

            if (solucion) {
                caballo.escribirTablero();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}