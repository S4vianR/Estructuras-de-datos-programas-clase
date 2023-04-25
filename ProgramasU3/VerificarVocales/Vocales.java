import java.util.Stack;

public class Vocales {
    /*
     * Crea una clase denominada VerificadorVocales con un método capaz de recibir
     * una cadena y una vocal y devolver un resultado que será:
     * 
     * 1 si el número de la vocal pasada como parámetro es par (hay equilibrio en
     * esa vocal),
     * 
     * -1 si el número de la vocal pasada como parámetro es impar (no hay equilibrio
     * en esa vocal) ó
     * 
     * 0 (no existe esa vocal en la cadena).
     * 
     * Para ello debes utilizar una pila (Stack).
     */

    public static void main(String[] args) {
        String cadena = "Hola mundo";
        char vocal = 'o';
        if (verificarVocal(cadena, vocal) == 1) {
            System.out.println("La vocal " + vocal + " es par"");
        } else if (verificarVocal(cadena, vocal) == -1) {
            System.out.println("La vocal " + vocal + " es impar");
        } else {
            System.out.println("No existe la vocal " + vocal + " en la cadena");
        }
    }

    public static int verificarVocal(String cadena, char vocal) {
        int resultado = 0;
        int contador = 0;
        Stack<Character> pila = new Stack<Character>();
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == vocal) {
                pila.push(cadena.charAt(i));
                contador++;
            }
        }
        if (contador == 0) {
            resultado = 0;
        } else if (contador % 2 == 0) {
            resultado = 1;
        } else {
            resultado = -1;
        }
        return resultado;
    }
}