package leetcode;

import java.util.HashMap;
import java.util.Map;

public class KDiffPairsInAnArray {
    public static int findPairs(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        int count = 0;
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (k == 0) {
                if (entry.getValue() >= 2) {
                    count++;
                }
            } else {
                if (frequency.containsKey(entry.getKey() + k)) {
                    count++;
                }
            }
        }
        return count;
    }
}
