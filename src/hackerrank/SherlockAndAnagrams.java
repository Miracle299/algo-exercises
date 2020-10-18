package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SherlockAndAnagrams {
    static int sherlockAndAnagrams(String s) {
        List<String> list = new ArrayList<>();
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                list.add(s.substring(i, j));
            }
        }

        for (int i = 0; i < list.size(); i++) {
            counter += countAnagrams(i, list);
        }
        return counter;
    }

    private static boolean isAnagram(String first, String second) {
        char[] chars1 = first.toCharArray();
        char[] chars2 = second.toCharArray();

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        return Arrays.equals(chars1, chars2);
    }

    private static int countAnagrams(int currentIndex, List<String> list) {
        String currentElement = list.get(currentIndex);
        List<String> newList = list.subList(currentIndex + 1, list.size());
        int counter = 0;

        for (int i = 0; i < newList.size(); i++) {
            if (currentElement.length() == newList.get(i).length() && isAnagram(currentElement, newList.get(i))) {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(sherlockAndAnagrams("abba"));
    }
}
