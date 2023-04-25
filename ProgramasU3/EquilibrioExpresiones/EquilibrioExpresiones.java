import java.util.Stack;
import java.util.Scanner;

public class EquilibrioExpresiones {
    public static boolean verifica(String cadena) {
        Stack<String> pila = new Stack();
        int i = 0;
        while (i < cadena.length()) {
            if (cadena.charAt(i) == '(')
                pila.push("(");
            else if (cadena.charAt(i) == ')')
                if (!pila.empty())
                    pila.pop();
                else {
                    pila.push(")");
                    break;
                }
            i++;
        }
        if (pila.empty())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String cadena = "((a+b)*c)";
        if (verifica(cadena) == true)
            System.out.println("La cadena esta balanceada");
        else
            System.out.println("La cadena no esta balanceada");
    }
}