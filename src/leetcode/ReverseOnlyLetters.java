package leetcode;

public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String S) {
        char[] letters = S.toCharArray();
        int start = 0;
        int end = S.length() - 1;

        while (start < end) {
            if (!Character.isLetter(letters[start])) {
                start++;
            } else if (!Character.isLetter(letters[end])) {
                end--;
            } else {
                swap(letters, start, end);
                start++;
                end--;
            }
        }
        return String.valueOf(letters);
    }

    private static void swap(char[] letters, int a, int b) {
        char temp = letters[b];
        letters[b] = letters[a];
        letters[a] = temp;
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj").equals("j-Ih-gfE-dCba"));
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!").equals("Qedo1ct-eeLg=ntse-T!"));
    }
}
