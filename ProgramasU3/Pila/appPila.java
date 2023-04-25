import java.util.Scanner;
public class appPila {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Ingrese el tamaño de la pila");
            int tamano = sc.nextInt();
            pila pila = new pila(tamano);
            int opcion = 0;
            do {
                System.out.println("1. Push");
                System.out.println("2. Pop");
                System.out.println("3. Mostrar");
                System.out.println("4. Cima");
                System.out.println("5. Vacia");
                System.out.println("6. Llena");
                System.out.println("7. Salir");
                System.out.println("Ingrese una opcion");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println("Ingrese un elemento");
                        int elemento = sc.nextInt();
                        try {
                            pila.push(elemento);
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("El elemento eliminado es: " + pila.pop());
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 3:
                        System.out.println(pila.toString());
                        break;
                    case 4:
                        try {
                            System.out.println("El elemento de la cima es: " + pila.cima());
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 5:
                        if (pila.vacia()) {
                            System.out.println("La pila esta vacia");
                        } else {
                            System.out.println("La pila no esta vacia");
                        }
                        break;
                    case 6:
                        if (pila.llena()) {
                            System.out.println("La pila esta llena");
                        } else {
                            System.out.println("La pila no esta llena");
                        }
                        break;
                    case 7:
                        System.out.println("Gracias por usar el programa");
                        break;
                    default:
                        System.out.println("Opcion incorrecta");
                        break;
                }
            } while (opcion != 7);
        }

        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
