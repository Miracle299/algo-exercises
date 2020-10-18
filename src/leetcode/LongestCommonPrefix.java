package leetcode;

public class LongestCommonPrefix {
    /**
     * This solution has time complexity O(minLen * n)
     */
    public static String longestCommonPrefix(String[] args) {
        if (args.length == 1) {
            return args[0];
        } else if (args.length == 0) {
            return "";
        }
        String first = args[0];
        int counter = 0;
        for (int i = 1; i < args.length; i++) {
            String temp = args[i];
            for (int j = 0; j < Math.min(first.length(), temp.length()); j++) {
                if (first.charAt(j) != temp.charAt(j) && j == 0) {
                    return "";
                } else if (first.charAt(j) == temp.charAt(j)) {
                    counter++;
                }
            }
            first = first.substring(0, counter);
            counter = 0;
        }
        return first;
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(longestCommonPrefix(new String[]{"a", "a", "a"}));
        System.out.println(longestCommonPrefix(new String[]{}));
    }
}
