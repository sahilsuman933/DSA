package recursion.problems;

public class FibonacciArr {
    public static int[] generateFibonacciNumbers(int n) {
        int[] ans = new int[n];
        return generateFibonacciNumbersHelper(0, n - 1, ans);

    }

    public static int[] generateFibonacciNumbersHelper(int idx, int n, int[] ans) {

        if (idx > n) {
            return ans;
        }

        if (idx < 2 && idx <= n) {
            ans[idx] = idx;
            return generateFibonacciNumbersHelper(idx + 1, n, ans);
        }

        ans[idx] = ans[idx - 1] + ans[idx - 2];
        return generateFibonacciNumbersHelper(idx + 1, n, ans);


    }
}
