package leetcode;

public class LongestPalindromicSubstring {

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            int len1 = expandFromMiddle(s, i, i);
            int len2 = expandFromMiddle(s, i, i + 1);
            int res = Math.max(len1, len2);

            if (res > end - start) {
                /** there we take Palindromic string and after that we divide the string in half
                 * and first half to current index (i)
                 */
                start = i - ((res - 1) / 2);
                /**
                 * there we do same operation with the exception of we find another part
                 */
                end = i + (res / 2);
            }
        }

        return s.substring(start, end + 1);
    }

    public static int expandFromMiddle(String s, int left, int right) {
        if (s == null || left > right) return 0;

        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }

    public static void main(String[] args) {
        longestPalindrome("babad");
    }
}
