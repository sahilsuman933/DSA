package recursion.conceptual;

import java.util.ArrayList;

public class SubsequenceCombinationSum {
    public static void printSubsequenceCombinationSum(ArrayList<Integer> list, int[] arr, int idx, int target) {
        if (target <= 0 || idx == arr.length) {
            if (target == 0) System.out.print(list + " ");
            return;
        }

        list.add(arr[idx]);
        printSubsequenceCombinationSum(list, arr, idx, target - arr[idx]);
        list.remove(list.size() - 1);
        printSubsequenceCombinationSum(list, arr, idx + 1, target);
    }

    public static void main(String[] args) {
        ArrayList<Integer> seqArr = new ArrayList<>();
        int[] arr = {1, 2, 3};

        printSubsequenceCombinationSum(seqArr, arr, 0, 3);


    }
}
