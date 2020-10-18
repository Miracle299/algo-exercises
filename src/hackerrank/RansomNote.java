package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magazineMap = new HashMap<>();

        for (int i = 0; i < magazine.length; i++) {
            magazineMap.computeIfPresent(magazine[i], (k, v) -> v + 1);
            magazineMap.putIfAbsent(magazine[i], 1);
        }

        int counter = 0;
        for (int i = 0; i < note.length; i++) {
            if (magazineMap.getOrDefault(note[i], -1) != -1) {
                if (magazineMap.get(note[i]) > 1) {
                    magazineMap.computeIfPresent(note[i], (k, v) -> v - 1);
                } else {
                    magazineMap.remove(note[i]);
                }
                counter++;
            }
        }

        if (counter == note.length) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        checkMagazine("give me one grand today night".split(" "), "give one grand today".split(" "));
        checkMagazine("two times three is not four".split(" "), "two times two is four".split(" "));
        checkMagazine("ive got a lovely bunch of coconuts".split(" "), "ive got some coconuts".split(" "));
    }
}
