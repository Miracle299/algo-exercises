package leetcode;

import java.util.List;

public class LongestWordInDictionaryThroughDeleting {
    public static String findLongestWord(String s, List<String> d) {
        String result = "";
        for (String str : d) {
            if (isSequence(s, str)) {
                if (str.length() > result.length() || (str.length() == result.length() && result.compareTo(str) > 0)) {
                    result = str;
                }
            }
        }

        System.out.println(result);
        return result;
    }

    private static boolean isSequence(String s, String d) {
        int j = 0;

        for (int i = 0; i < s.length() && j < d.length(); i++) {
            if (s.charAt(i) == d.charAt(j)) {
                j++;
            }
        }
        return j == d.length();
    }

    public static void main(String[] args) {
        findLongestWord("abpcplea", List.of("ale","apple","monkey","plea"));
    }
}
