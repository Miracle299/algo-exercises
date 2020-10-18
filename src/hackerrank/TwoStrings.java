package hackerrank;

import java.util.HashSet;
import java.util.Set;

public class TwoStrings {

    public static String twoString(String first, String second) {
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();

        for (int i = 0; i < first.length(); i++) {
            set1.add(first.charAt(i));
        }

        for (int i = 0; i < second.length(); i++) {
            set2.add(second.charAt(i));
        }

        set1.retainAll(set2);

        return set1.isEmpty() ? "NO" : "YES";
    }

    public static void main(String[] args) {
        System.out.println(twoString("beetroot", "sandals"));
    }
}
