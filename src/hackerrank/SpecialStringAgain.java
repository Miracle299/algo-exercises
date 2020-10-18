package hackerrank;

import java.util.HashSet;
import java.util.Set;

public class SpecialStringAgain {
    static Set<String> substrCount(int n, String s) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (isValid(s.substring(i, j))) {
                    set.add(s.substring(i, j));
                }
            }
        }
        return set;
    }

    private static boolean isValid(String substring) {
        boolean flag = true;
        int firstChar = substring.charAt(0);
        if (substring.length() == 1) {
            return true;
        }
        for (int i = 1; i < substring.length(); i++) {
            if (!flag && firstChar != substring.charAt(i)) {
                return false;
            }
            if (firstChar != substring.charAt(i)) {
                flag = false;
                continue;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(substrCount(5, "abcbaba"));
    }
}
