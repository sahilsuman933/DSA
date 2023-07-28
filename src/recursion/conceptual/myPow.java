package recursion.conceptual;

public class myPow {
    public static double myPow(double x, int n) {
        int end = n > 0 ? n : -1 * n;
        return myPowHelper(x, n, 1, end, 1);
    }

    public static double myPowHelper(double x, int n, int start, int end, double ans) {
        if (start > end) {
            return ans;
        }

        if (n > 0) {
            return myPowHelper(x, n, start + 1, end, (ans * x));
        } else {
            return myPowHelper(x, n, start + 1, end, ans / x);
        }

    }

    public static double myPowOptimized(double x, int n) {
        if (n == 0) {
            return 1;
        }

        if (n == 1) {
            return x;
        }

        if (n == -1) {
            return 1 / x;
        }

        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        } else {
            return x * myPow(x * x, (n - 1) / 2);
        }
    }


    public static void main(String[] args) {
        System.out.println(myPowOptimized(2, -10));
    }
}
