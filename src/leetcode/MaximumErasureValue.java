package leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class MaximumErasureValue {
    public static int maximumUniqueSubarray(int[] nums) {
        Set<Integer> unique = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int result = 0;
        int a = 0;
        int b = 0;
        int sum = 0;

        while (b < nums.length) {
            if (unique.contains(nums[b])) {
                sum += nums[b];
            } else {
                a++;
            }
            b++;
        }
        return result;
    }

    public static void main(String[] args) {
        maximumUniqueSubarray(new int[] {4,2,4,5,6});
    }
}
