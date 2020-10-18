package leetcode;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strings) {
        Map<String, List<String>> result = new HashMap<>();
        for (String str : strings) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            result.computeIfPresent(String.copyValueOf(arr), (key, value) -> {
                value.add(str);
                return value;
            });
            result.computeIfAbsent(String.copyValueOf(arr), data -> {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                return temp;
            });
        }
        return new ArrayList<>(result.values());
    }

    public static void main(String[] args) {
        Collection<List<String>> list = new GroupAnagrams().groupAnagrams(new String[]{"a"});
        System.out.println(list);
    }
}
