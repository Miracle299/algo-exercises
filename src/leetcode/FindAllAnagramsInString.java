package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindAllAnagramsInString {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() == 0)
            return result;

        int[] charFrequency = new int[26];
        int start = 0;
        int end = 0;
        int count = p.length();

        for (char ch : p.toCharArray()) {
            charFrequency[ch - 'a']++;
        }

        while (end < s.length()) {
            if (charFrequency[s.charAt(end++) - 'a']-- >= 1) {
                count--;
            }

            if (count == 0) {
                result.add(start);
            }

            if (end - start == p.length() && charFrequency[s.charAt(start++) - 'a']++ >= 0) {
                count++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        findAnagrams("cbaebabacd", "abc"); //[0,6]
        findAnagrams("abab", "ab");
        findAnagrams("baa", "aa");
    }
}
