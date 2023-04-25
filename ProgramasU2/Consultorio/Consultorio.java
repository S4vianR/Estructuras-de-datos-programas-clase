
// Realizar un programa para registro de citas de un consultorio medico de un
// día determinado, el cual solo puede registrar una cita por hora al día, el
// horario de consulta es de 10 a 17 horas, el programa debe indicar si se puede
// registrar la cita o no (dependiendo si esta libre el horario requerido), al
// no poder pedirá de nuevo otro horario hasta que se pueda asignar una.
import java.util.Scanner;

public class Consultorio {

    public static void main(String[] args) {
        int hora;
        int[] horario = new int[8];
        boolean condition = true;
        do {
            System.out.println("\nHorario de citas: ");
            for (int i = 0; i < horario.length; i++) {
                System.out.println((i + 10) + ":00");
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("\nIngrese la hora de la cita: ");
            hora = sc.nextInt();
            if (hora >= 10 && hora <= 17) {
                if (horario[hora - 10] == 0) {
                    horario[hora - 10] = 1;
                    System.out.println("Cita registrada");
                } else {
                    System.out.println("La hora ya esta ocupada");
                }
            } else {
                System.out.println("La hora no es valida");
            }
            System.out.println("\nDesea registrar otra cita? (1 = si, 0 = no)");
            int respuesta = sc.nextInt();
            if (respuesta == 0) {
                condition = false;
            }
        } while (condition);
    }
}