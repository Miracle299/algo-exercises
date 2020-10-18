package leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    private Map<Character, Integer> map = new HashMap<>();

    private void init() {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public int romanToInt(String s) {
        init();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i != 0 && map.get(s.charAt(i - 1)) < map.get(s.charAt(i))) {
                res += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
            } else {
                res += map.get(s.charAt(i));
            }
        }
        return res;
    }

    public static void main(String[] args) {
        RomanToInteger toInteger = new RomanToInteger();
        System.out.println(toInteger.romanToInt("XIX"));
    }
}
