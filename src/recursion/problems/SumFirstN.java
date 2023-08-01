package recursion.problems;

public class SumFirstN {
    public static int sumFirstN(int n) {
        return sumFirstNHelper(n, 0);
    }

    public static int sumFirstNHelper(int x, int ans) {
        if (x < 1) {
            return ans;
        }

        return sumFirstNHelper(x - 1, ans + x);

    }
}
