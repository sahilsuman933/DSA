package recursion.conceptual;

import java.util.ArrayList;

public class SubsequencesSubsetSum {
    public static void printSubsequences(ArrayList<Integer> seq, int[] arr, int idx, int sum, int K) {
        if (idx >= arr.length) {
            if (sum == K) System.out.print(seq + " ");
            return;
        }

        seq.add(arr[idx]);
        printSubsequences(seq, arr, idx + 1, sum + arr[idx], K);
        seq.remove(seq.size() - 1);
        printSubsequences(seq, arr, idx + 1, sum, K);

    }

    public static void main(String[] args) {
        ArrayList<Integer> seq = new ArrayList<>();
        int[] arr = {10,1,2,7,6,1,5};

        printSubsequences(seq, arr, 0, 0, 8);

    }
}
