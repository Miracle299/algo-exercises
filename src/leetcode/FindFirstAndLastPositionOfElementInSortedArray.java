package leetcode;

import java.util.Arrays;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 1 && nums[0] == target) {
            return new int[] { 0, 0 };
        }

        int firstPosition = Arrays.binarySearch(nums, target);
        int secondPosition = firstPosition;

        if (firstPosition < 0) {
            return new int[] { -1, -1 };
        }

        int i = firstPosition + 1;
        int j = firstPosition - 1;

        while (i < nums.length && nums[i++] == target) {
            firstPosition++;
        }
        while (j >= 0 && nums[j--] == target) {
            secondPosition--;
        }

        return new int[] { secondPosition, firstPosition };
    }

    public static void main(String[] args) {
        searchRange(new int[] { 2, 2 }, 2);
    }
}
