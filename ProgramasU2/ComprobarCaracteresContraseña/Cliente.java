/*
 * Escribir una clase con sólo una variable de instancia, una cadena que
 * represente una contraseña. Escriba un método recursivo para comprobar si la
 * contraseña contiene al menos un carácter que sea un dígito del (0 al 9). Su
 * programa debe incluir una clase cliente para probar su método recursivo.
 */

import java.util.Scanner;

public class Cliente {
    private String pass;
    private int i;
    private boolean flag;

    public Cliente() {
        pass = "";
        i = 0;
        flag = false;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }

    public void checkPass() {
        if (i < pass.length()) {
            if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9') {
                this.flag = true;
            }
            i++;
            checkPass();
        }
    }

    public boolean getFlag() {
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente p = new Cliente();
        System.out.print("Ingrese la contraseña: ");
        p.setPass(sc.nextLine());
        p.checkPass();
        if (p.getFlag()) {
            System.out.println("La contraseña contiene al menos un dígito.");
        } else {
            System.out.println("La contraseña no contiene ningún dígito.");
        }
    }
}
