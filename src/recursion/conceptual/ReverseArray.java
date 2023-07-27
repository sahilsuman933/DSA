package recursion.conceptual;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArray(int n, int[] nums) {
        return reverseArrayHelper(0, n - 1, nums);
    }

    public static int[] reverseArrayHelper(int start, int end, int[] nums) {

        if (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            return reverseArrayHelper(start + 1, end - 1, nums);
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(3, new int[]{1, 2, 3})));
    }
}
