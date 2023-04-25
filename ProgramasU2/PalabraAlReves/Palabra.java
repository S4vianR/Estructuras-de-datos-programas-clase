// Realizar un programa que pida una palabra y la regrese la palabra al revés

import java.util.Scanner;
public class Palabra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Preguntar por palabra para retornarla al revés
        String palabra, palabraAlReves;
        System.out.println("Introduce una palabra: ");
        palabra = sc.nextLine();
        palabraAlReves = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraAlReves += palabra.charAt(i);
        }
        System.out.println(palabraAlReves);
    }
}