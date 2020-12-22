package leetcode;

public class MinimumSizeSubarraySum {
    public static int minSubArrayLen(int s, int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;

        int length = Integer.MAX_VALUE;
        int a = 0;
        int b = 0;
        int sum = 0;

        while (b < nums.length) {
            sum += nums[b];

            while (sum >= s) {
                length = Math.min(length, b - a);
                sum -= nums[a++];
            }
            b++;
        }

        return length == Integer.MAX_VALUE ? 0 : length;
    }

    public static void main(String[] args) {
        minSubArrayLen(7, new int[] { 2, 3, 1, 2, 4, 3 }); // 2
        minSubArrayLen(7, new int[] { 2, 3, 7, 2, 4, 3 }); // 1
    }
}
