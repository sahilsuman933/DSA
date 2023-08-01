package recursion.conceptual;

import java.util.ArrayList;

public class SubsequencesSubsetSumOneAnswer {
    public static boolean printSubsequences(ArrayList<Integer> seq, int[] arr, int idx, int sum, int K) {
        if (idx >= arr.length) {
            if (sum == K) {
                System.out.print(seq + " ");
                return true;
            }
            return false;
        }

        seq.add(arr[idx]);
        if (printSubsequences(seq, arr, idx + 1, sum + arr[idx], K) == true) return true;

        seq.remove(seq.size() - 1);
        if (printSubsequences(seq, arr, idx + 1, sum, K) == true) return true;
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> seq = new ArrayList<>();
        int[] arr = {1, 2, 3};

        printSubsequences(seq, arr, 0, 0, 3);

    }
}
