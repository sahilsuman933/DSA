package recursion.conceptual;

public class SubsequenceSubsetSumCount {
    public static int printSubsequences(int[] arr, int idx, int sum, int K) {
        if (idx == arr.length) {
            if (sum == K) return 1;
            return 0;
        }

        int left = printSubsequences(arr, idx + 1, sum + arr[idx], K);
        int right = printSubsequences(arr, idx + 1, sum, K);

        return left + right;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println(printSubsequences(arr, 0, 0, 3));

    }
}
