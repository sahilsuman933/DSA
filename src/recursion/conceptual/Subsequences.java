package recursion.conceptual;

import java.util.ArrayList;

public class Subsequences {
    public static void printSubsequences(ArrayList<Integer> seq, int[] arr, int idx) {
        if (idx >= arr.length) {
            System.out.print(seq + " ");
            return;
        }

        seq.add(arr[idx]);
        printSubsequences(seq, arr, idx + 1);
        seq.remove(seq.size() - 1);
        printSubsequences(seq, arr, idx + 1);

    }

    public static void main(String[] args) {
        ArrayList<Integer> seq = new ArrayList<>();
        int[] arr = {1, 2, 3};

        printSubsequences(seq, arr, 0);

    }
}
