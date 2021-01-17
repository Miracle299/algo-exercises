package leetcode;

import java.util.ArrayList;
import java.util.List;

public class ReverseWordInAString {
    public static String reverseWords(String s) {
        if (s.isEmpty()) {
            return "";
        }
        List<String> words = new ArrayList<>();
        int pointer = 0;

        while (pointer < s.length()) {
            if (s.charAt(pointer) != ' ') {
                int start = pointer;
                while (pointer < s.length() && (Character.isAlphabetic(s.charAt(pointer)) || Character.isDigit(s.charAt(pointer)))) {
                    pointer++;
                }
                words.add(0, s.substring(start, pointer));
            }
            pointer++;
        }
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("the sky is blue"));
        System.out.println(reverseWords("a good   example"));
        System.out.println(reverseWords("EPY2giL"));
    }
}
