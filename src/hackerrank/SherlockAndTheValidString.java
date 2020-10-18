package hackerrank;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SherlockAndTheValidString {

    static String isValid(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.putIfAbsent(c, 0);
            map.computeIfPresent(c, (key, value) -> value + 1);
        }

        Set<Integer> values = new HashSet<>(map.values());

        if (values.size() == 1) {
            return "YES";
        }
        if (values.size() > 2) {
            return "NO";
        }

        int max = 0;
        int min = Integer.MAX_VALUE;
        int sameAsMax = 0;
        int sameAsMin = 0;

        for (Integer value : values) {
            if (value > max) {
                max = value;
            }
            if (value < min) {
                min = value;
            }
        }

        for (Integer value : map.values()) {
            if (value == max) {
                sameAsMax++;
            }
            if (value == min) {
                sameAsMin++;
            }
        }

        if (min == 1 && sameAsMin == 1) {
            return "YES";
        }
        if ((max - min) == 1 && sameAsMax == 1) {
            return "YES";
        }
        return "NO";
    }
}
