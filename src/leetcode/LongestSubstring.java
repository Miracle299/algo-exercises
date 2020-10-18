package leetcode;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int length = s.length();
        if (length == 1) {
            return length;
        }
        int counter = 0;
        int size = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < length; i++) {
            for (int j = i; j < length; j++) {
                char ch = s.charAt(j);
                if (set.contains(ch)) {
                    if (counter > size) {
                        size = counter;
                    }
                    counter = 0;
                    set.clear();
                    break;
                }
                set.add(ch);
                counter++;
            }
        }
        return size;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbb");
        lengthOfLongestSubstring("bbbbb");
        lengthOfLongestSubstring("aab");
        lengthOfLongestSubstring("pwwkew");
        lengthOfLongestSubstring(" ");
    }
}
