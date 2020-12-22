package leetcode;

/**
 * Given a string s that consists of only uppercase English letters, you can perform at most k operations on that string.
 * In one operation, you can choose any character of the string and change it to any other uppercase English character.
 * Find the length of the longest sub-string containing all repeating letters you can get after performing the above operations.
 */
public class LongestRepeatingCharacterReplacement {
    public int characterReplacement(String s, int k) {
        int[] lettersFrequency = new int[26];//26 english letters in alphabet
        int maxSequenceLength = 0;
        int startPointer = 0;
        int endPointer = 0;

        while (endPointer < s.length()) {
            maxSequenceLength = Math.max(maxSequenceLength, ++lettersFrequency[s.charAt(endPointer) - 'A']);
            if ((endPointer - startPointer + 1) - maxSequenceLength > k) {
                lettersFrequency[s.charAt(startPointer++) - 'A']--;
            }
            endPointer++;
        }
        return s.length() - startPointer;
    }

    public static void main(String[] args) {
        new LongestRepeatingCharacterReplacement().characterReplacement("ABAB", 2);
        //        new LongestRepeatingCharacterReplacement().characterReplacement("ABBCCCACAC", 2);
    }
}
