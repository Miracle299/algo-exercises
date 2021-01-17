package leetcode;

import java.util.Arrays;

public class PermutationInString {
    public static boolean checkInclusion(String s1, String s2) {
        int[] s1Frequency = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Frequency[s1.charAt(i) - 'a']++;
        }

        int[] s2Frequency = new int[26];
        for (int i = 0; i < s2.length(); i++) {
            s2Frequency[s2.charAt(i) - 'a']++;
            if (i >= s1.length()) {
                s2Frequency[s2.charAt(i - s1.length()) - 'a']--;
            }
            if (Arrays.equals(s1Frequency, s2Frequency)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        checkInclusion("ab", "eidbaooo");//true
        System.out.println(checkInclusion("ab", "eidbaooo"));//false
    }
}
