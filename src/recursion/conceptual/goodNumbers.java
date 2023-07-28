package recursion.conceptual;

import java.util.ArrayList;
import java.util.List;

public class goodNumbers {
    public static List<Integer> goodNumbers(int a, int b, int digit) {

        List<Integer> arr = new ArrayList<>();

        for (int i = a; i <= b; i++) {
            if (i % 10 == digit) continue;
            if (isGood(i / 10, digit, i % 10))
                arr.add(i);
        }
        return arr;
    }

    public static boolean isGood(int x, int digit, int sum) {
        if (x == 0) {
            return true;
        }

        int rem = x % 10; // curr digit

        if (rem <= sum || rem == digit) {
            return false;
        }

        return isGood(x / 10, digit, sum + rem);
    }

    public static void main(String[] args) {

    }

}
