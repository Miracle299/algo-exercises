package leetcode;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num; // if nums[i] == a and a == 0, nums[i] ^ a == 0 and nums[i] != a, nums[i] ^ 0 == nums[i]
        }
        return res;
    }
}
