package hackerrank;

public class MakingAnagram {
    public static int makeAnagram(String a, String b) {
        int deletions = 0;
        int[] aFrequency = new int[26];
        int[] bFrequency = new int[26];

        for (int i = 0; i < a.length(); i++) {
            int charToInt = a.charAt(i);
            int position = charToInt - 'a';
            aFrequency[position]++;
        }

        for (int i = 0; i < b.length(); i++) {
            int charToInt = b.charAt(i);
            int position = charToInt - 'a';
            bFrequency[position]++;
        }

        for (int i = 0; i < 26; i++) {
            int difference = Math.abs(aFrequency[i] - bFrequency[i]);
            deletions += difference;
        }

        return deletions;
    }

    public static void main(String[] args) {
        System.out.println(makeAnagram("cde", "abc"));
    }
}
