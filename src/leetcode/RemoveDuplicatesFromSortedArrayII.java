package leetcode;

/**
 * Given a sorted array nums, remove the duplicates in-place such that duplicates appeared at most twice and return the new length.
 * Do not allocate extra space for another array; you must do this by modifying the input array in-place with O(1) extra memory.
 */
public class RemoveDuplicatesFromSortedArrayII {
    public static int removeDuplicates(int[] nums) {
        int i = 2;

        for (int j = 2; j < nums.length; j++) {
            if(nums[j] != nums[i - 2]) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] { 0, 0, 1, 1, 1, 1, 2, 3, 3 }));
    }
}
