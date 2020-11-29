package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequency = new HashMap<>();
        List<Integer>[] buckets = new List[nums.length + 1];
        for (int num : nums) {
            frequency.computeIfPresent(num, (key, value) -> value + 1);
            frequency.putIfAbsent(num, 1);
        }

        for (int num : frequency.keySet()) {
            int freq = frequency.get(num);
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }

        List<Integer> result = new ArrayList<>();

        for (int pos = buckets.length - 1; pos >= 0 && result.size() < k; pos--) {
            if (buckets[pos] != null) {
                result.addAll(buckets[pos]);
            }
        }
        return Arrays.stream(result.toArray()).mapToInt(value -> (int) value).toArray();
    }

    public static void main(String[] args) {
        int[] arr = new TopKFrequentElements().topKFrequent(new int[] { 1, 1, 1, 2, 2, 3, 2 }, 2);
        System.out.println(Arrays.toString(arr));
    }
}
