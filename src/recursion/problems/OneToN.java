package recursion.problems;


public class OneToN {

    public static int[] printNos(int x) {
        int[] ans = new int[x];
        return printNosHelper(x, ans);
    }

    public static int[] printNosHelper(int x, int[] ans) {
        if (x < 1) {
            return ans;
        }

        ans[x - 1] = x;
        return printNosHelper(x - 1, ans);
    }


}
