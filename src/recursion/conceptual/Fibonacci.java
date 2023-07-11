package recursion.conceptual;

public class Fibonacci {

    public static int Fib(int n) {
        if (n < 2) return n;

        return Fib(n - 1) + Fib(n - 2);

    }

    public static void main(String[] args) {
        System.out.println(Fib(5));
    }
}
