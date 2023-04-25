/*
 * Escribir una clase con dos variables de instancia, en representación de la
 * misma contraseña. escribir un método recursivo que comprueba si las dos
 * contraseñas son iguales. Su programa debe incluir una clase de cliente para
 * probar su clase
 */
import java.util.Scanner;
public class Password {
    private String password;
    private String password2;

    public Password(String password, String password2) {
        this.password = password;
        this.password2 = password2;
    }

    public String checkPassword() {
        return checkPassword(password, password2);
    }

    private String checkPassword(String password, String password2) {
        if (password.length() != password2.length()) {
            return "Las contraseñas no coinciden";
        } else if (password.length() == 0) {
            return "Las contraseñas coinciden";
        } else if (password.charAt(0) != password2.charAt(0)) {
            return "Las contraseñas no coinciden";
        } else {
            return checkPassword(password.substring(1), password2.substring(1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = sc.nextLine();
        System.out.print("Enter password again: ");
        String password2 = sc.nextLine();
        Password p = new Password(password, password2);
        System.out.println(p.checkPassword());
    }
}