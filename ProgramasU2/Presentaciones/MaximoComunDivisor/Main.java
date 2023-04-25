public class Main {
    public static void main(String[] args) {
        int a = 18;
        int b = 12;
        int mcd = maximoComunDivisor(a, b);
        System.out.println("El MCD de " + a + " y " + b + " es " + mcd);
    }

    public static int maximoComunDivisor(int a, int b) { // caso base
        if (b == 0) {
            return a;
        }
        // caso recursivo else {
        int r = a % b;
        return maximoComunDivisor(b, r);
    }
}