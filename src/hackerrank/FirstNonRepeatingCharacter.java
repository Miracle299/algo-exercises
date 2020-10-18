package hackerrank;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    static char firstNonRepeatingChar(String word) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < word.length(); i++) {
            map.putIfAbsent(word.charAt(i), 0);
            map.put(word.charAt(i), map.get(word.charAt(i)) + 1);
        }
        return getKey(map, 1);
    }

    public static char getKey(Map<Character, Integer> map, Integer value) {
        return map.entrySet()
                .stream()
                .filter(entry -> value.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst().orElse(' ');
    }

    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("aaabcccdeeef"));
    }
}
