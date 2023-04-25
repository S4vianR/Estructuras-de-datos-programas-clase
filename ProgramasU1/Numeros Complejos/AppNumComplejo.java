import java.util.Scanner;

public class AppNumComplejo {

    public static void main(String[] args) {
        int op = 0;
        Scanner s1 = new Scanner(System.in);
        NumComplejo nc1 = new NumComplejo();
        NumComplejo nc2 = new NumComplejo();

        // Menu
        do {
            int numR1 = 0, numI1 = 0, numR2 = 0, numI2;
            System.out.println("Menu");
            System.out.println("1. Asignar valores");
            System.out.println("2. Mostrar numeros complejos");
            System.out.println("3. Suma de numeros complejos");
            System.out.println("4. Resta de numeros complejos");
            System.out.println("5. Multiplicacion de numeros complejos");
            System.out.println("6. Salir");
            System.out.println("Introduce una opcion: ");
            op = s1.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Asignar valores");
                    System.out.println("Introduce el primer numero real: ");
                    numR1 = s1.nextInt();
                    System.out.println("Introduce el primer numero imaginario: ");
                    numI1 = s1.nextInt();
                    System.out.println("Introduce el segundo numero real: ");
                    numR2 = s1.nextInt();
                    System.out.println("Introduce el segundo numero imaginario: ");
                    numI2 = s1.nextInt();
                    nc1.setReal(numR1);
                    nc1.setImaginario(numI1);
                    nc2.setReal(numR2);
                    nc2.setImaginario(numI2);
                    break;
                case 2:
                    System.out.println("Mostrar numeros complejos");
                    System.out.println(nc1.toString());
                    break;
                case 3:
                    System.out.println("Suma de numeros complejos");
                    nc1.suma(nc1, nc2);
                    break;
                case 4:
                    System.out.println("Resta de numeros complejos");
                    nc1.resta(nc1, nc2);
                    break;
                case 5:
                    System.out.println("Multiplicacion de numeros complejos");
                    nc1.multiplicacion(nc1, nc2);
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;
            }
        } while (op != 6);
    }
}