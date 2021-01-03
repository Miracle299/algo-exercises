package leetcode;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int N = nums.length;
        k %= N;
        revert(nums, 0, N - 1);
        revert(nums, 0, k - 1);
        revert(nums, k, N - 1);
        System.out.println(Arrays.toString(nums));
    }

    private static void revert(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        rotate(new int[] {1,2,3,4,5,6,7}, 3);
//        rotate(new int[] {-1,-100,3,99}, 2);
    }
}
