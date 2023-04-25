
// Reuben Rhienhart 20112048
import java.util.Scanner;

public class AppFracciones {
    public static void main(String[] args) {
        int op = 0, num1 = 0, num2 = 0, denom1 = 0, denom2 = 0;
        Scanner s1 = new Scanner(System.in);
        Fracciones frac = new Fracciones();

        do {
            System.out.println(
                    "\nMenu\n1.Asignar valores a 2 fracciones\n2.Suma de fracciones\n3.Resta de fracciones\n4.Multiplicacion de fracciones\n5.Division de fracciones\n6.Salir");
            op = s1.nextInt();
            switch (op) {
                case 1:
                    System.out.println("\nIngrese el valor al numerador de la primera fraccion:");
                    num1 = s1.nextInt();
                    frac.setNum1(num1);
                    System.out.println("\nIngrese el valor al denomidador de la primera fraccion:");
                    denom1 = s1.nextInt();
                    frac.setDenom1(denom1);
                    System.out.println("\nIngrese el valor al numerador de la segunda fraccion:");
                    num2 = s1.nextInt();
                    frac.setNum2(num2);
                    System.out.println("\nIngrese el valor al denomidador de la segunda fraccion:");
                    denom2 = s1.nextInt();
                    frac.setDenom2(denom2);
                    System.out.println(frac);
                    break;
                case 2:
                    frac.sumaF(num1, num2, denom1, denom2);
                    break;
                case 3:
                    frac.restaF(num1, num2, denom1, denom2);
                    break;
                case 4:
                    frac.multiplicacionF(num1, num2, denom1, denom2);
                    break;
                case 5:
                    frac.divisionF(num1, num2, denom1, denom2);
                    break;
                case 6:
                    System.out.println("Saliendo.....");
                    break;
            }
        } while (op != 6);
    }
}
