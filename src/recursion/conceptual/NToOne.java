package recursion.conceptual;

public class NToOne {
    public static int[] printNos(int x) {
        int[] ans = new int[x];
        return printNosHelper(x, ans, 0);
    }

    public static int[] printNosHelper(int x, int[] ans, int idx) {
        if (x < 1) {
            return ans;
        }

        ans[idx] = x;
        return printNosHelper(x - 1, ans, idx + 1);
    }
}
