package leetcode;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int i = 0;

        int[] indexes = new int[128];

        for (int j = 0; j < s.length(); j++) {
            i = Math.max(i, indexes[s.charAt(j)]);
            result = Math.max(result, j - i + 1);
            indexes[s.charAt(j)] = j + 1;
        }

        return result;
    }
}
