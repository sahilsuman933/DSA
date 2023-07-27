package recursion.conceptual;

import java.util.ArrayList;
import java.util.List;

public class factorialNumbers {

    public static List<Long> factorialNumbers(long n) {
        List<Long> ans = new ArrayList<>();
        return factorialNumbersHelper(n, 1, 1, ans);
    }

    public static List<Long> factorialNumbersHelper(long n, long currentNumberFactorial, long currentNumberWhoseFactorialToCalculate, List<Long> ans) {
        if (currentNumberFactorial * currentNumberWhoseFactorialToCalculate <= n) {
            ans.add(currentNumberFactorial * currentNumberWhoseFactorialToCalculate);
            return factorialNumbersHelper(n, currentNumberFactorial * currentNumberWhoseFactorialToCalculate, currentNumberWhoseFactorialToCalculate + 1, ans);
        }

        return ans;

    }

    public static void main(String[] args) {

        System.out.println(factorialNumbers(7));


    }
}
