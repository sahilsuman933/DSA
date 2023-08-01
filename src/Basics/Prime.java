package Basics;

public class Prime {

    // Prime Number => Divisible by 1 & itself and factors = 2


    // Normal Approach. Check whether the number is divisible by all the previous number or not.
    public static boolean isPrimeBrute(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static boolean isPrimeSimpleSieve(int n) {
        // We can also write the condition i*i <= n
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println((int) Math.sqrt(15));
        System.out.println(isPrimeSimpleSieve(101));

    }
}
