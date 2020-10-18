package hackerrank;

public class AlternativeCharacters {
    static int alternatingCharacters(String s) {
        char[] charArr = s.toCharArray();
        int counter = 0;
        for (int i = 0; i < charArr.length - 1; i++) {
            if (charArr[i] == charArr[i + 1]) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(alternatingCharacters("ABABABAB"));
        System.out.println(alternatingCharacters("AAAA"));
        System.out.println(alternatingCharacters("BBBBB"));
        System.out.println(alternatingCharacters("AAABBB"));
    }
}
