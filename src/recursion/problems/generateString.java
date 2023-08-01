package recursion.problems;

import java.util.ArrayList;
import java.util.List;

public class generateString {

    public static List<String> generateString(int N) {
        List<String> ans = new ArrayList<>();
        return generateStringHelper(ans, "", N);

    }

    public static List<String> generateStringHelper(List<String> ans, String tempData, int N) {
        if (tempData.length() == N) {
            ans.add(tempData);
            return ans;
        }

        if (tempData.length() == 0 || tempData.substring(tempData.length() - 1).contains("0")) {
            tempData += "0";
            generateStringHelper(ans, tempData, N);
            tempData = tempData.substring(0, tempData.length() - 1);
            tempData += "1";
            return generateStringHelper(ans, tempData, N);
        } else {
            tempData += "0";
            return generateStringHelper(ans, tempData, N);
        }

    }

    public static void main(String[] args) {
        System.out.println(generateString(4));

    }
}
