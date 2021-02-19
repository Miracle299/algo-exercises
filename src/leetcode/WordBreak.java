package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        if (wordDict.isEmpty() || s.isEmpty()) {
            return false;
        }
        Set<String> set = new HashSet<>(wordDict);
        int counter = 0;
        int a = 0;
        int b = 0;

        while (b <= s.length()) {
            if (set.contains(s.substring(a,b))) {
                counter++;
                a = b;
            }
            b++;
        }

        return counter >= wordDict.size();
    }

    public static void main(String[] args) {
//        System.out.println(wordBreak("leetcode", List.of("leet", "code")));
//        System.out.println(wordBreak("applepenapple", List.of("apple", "pen")));
        System.out.println(wordBreak("catsandog", List.of("cats", "dog", "sand", "and", "cat")));
    }
}
