package recursion.problems;

public class atoi {
    public static int atoi(String str) {
        char[] strChar = str.toCharArray();
        return atoiHelper(0, strChar.length - 1, strChar, false, 0, 0);
    }

    public static int atoiHelper(int start, int end, char[] strChar, boolean isNegative, int ans, int ansLen) {
        int ASCII = (int) strChar[start];
        if (start == 0 && ASCII == 45) {
            return atoiHelper(start + 1, strChar.length - 1, strChar, true, 0, ansLen);
        }

        if (ASCII >= 48 && ASCII <= 57) {
            int value = ASCII - '0';

            if (ansLen == 0) {
                return atoiHelper(start + 1, strChar.length - 1, strChar, isNegative, value, ansLen + 1);
            }

            double tempAns = value + ans * Math.pow(10, ansLen);
            if (start == end) {
                return isNegative ? -1 * (int) tempAns : (int) tempAns;
            }

            // Jugaaddd
            if (ansLen == 1) {
                return atoiHelper(start + 1, strChar.length - 1, strChar, isNegative, (int) tempAns, ansLen);
            } else {
                return atoiHelper(start + 1, strChar.length - 1, strChar, isNegative, (int) tempAns, ansLen + 1);
            }

        }

        if (start == end) {
            return ans;
        } else {
            return atoiHelper(start + 1, strChar.length - 1, strChar, isNegative, ans, ansLen);
        }

    }

    public static void main(String[] args) {
        System.out.println(atoi("-ban23"));

    }
}
