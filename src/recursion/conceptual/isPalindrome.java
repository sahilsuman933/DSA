package recursion.conceptual;

import java.util.Arrays;

public class isPalindrome {

    public static boolean isPalindrome(String str) {
        char[] strCharArr = str.toCharArray();
        String reverseString = new String(isPalindromeHelper(0, strCharArr.length - 1, strCharArr));
        return reverseString.equals(str) ? true : false;
    }

    public static char[] isPalindromeHelper(int start, int end, char[] strCharArr) {
        if (start <= end) {
            char temp = strCharArr[start];
            strCharArr[start] = strCharArr[end];
            strCharArr[end] = temp;
            return isPalindromeHelper(start + 1, end - 1, strCharArr);
        }

        return strCharArr;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("bbb"));
    }
}
