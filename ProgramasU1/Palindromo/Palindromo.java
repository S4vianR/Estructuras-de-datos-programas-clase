// Reuben Rhienhart 20112048
import java.util.Scanner;
public class Palindromo {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Capture la palabra a comprobar si es palindromo");
        String palabra = s1.nextLine();
        if (ajustar(palabra))
            System.out.println("La palabra es palindromo");
        else
            System.out.println("La palabra no es palindromo");
    }

    public static boolean comprobar(String palabra) {
        if (palabra.length() == 0 || palabra.length() == 1)
            return true;
        else {
            if (palabra.charAt(0) == palabra.charAt(palabra.length() - 1))
                return comprobar(palabra.substring(1, palabra.length() - 1));
            else
                return false;
        }
    }

    public static boolean ajustar(String palabra) {
        palabra = palabra.toLowerCase();
        String sinespacios = palabra.replaceAll(" ", "");
        return comprobar(sinespacios);
    }
}