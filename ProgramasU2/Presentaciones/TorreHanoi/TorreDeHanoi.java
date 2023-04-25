import java.util.Scanner;
public class TorreDeHanoi {
    static int cont;
    
    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int disc;
        System.out.println("Numero de discos: ");
        disc=cap.nextInt();
        hanoi(disc, 'A', 'B', 'C');
    }
    static void hanoi(int n, char origen, char destino, char auxiliar){
        if (n==1){
            cont++;
            System.out.println("("+cont+") Mueve el disco 1 de "+origen+" a "+destino);
            return;
        }
        hanoi(n-1, origen, auxiliar, destino);
        cont++;
        System.out.println("("+cont+") Mueve el disco "+n+" de "+origen+" a "+destino);
        hanoi(n-1, auxiliar, destino, origen);
   }
}