public class mainFibonacci {
    public static int fibonacci(int n) {
        if (n == 1)
            return 1;
        else if (n == 0)
            return 0;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++)
            System.out.println("Fibonacci de " + i + " es de = " + fibonacci(i));
    }
}