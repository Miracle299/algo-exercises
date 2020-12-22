package leetcode;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int a = m - 1;
        int b = n - 1;
        int finish = m + n - 1;

        while (a >= 0 && b >= 0) {
            nums1[finish--] = nums1[a] > nums2[b] ? nums1[a--] : nums2[b--];
        }

        while (b >= 0) {
            nums1[finish--] = nums2[b--];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.merge(new int[] { 1, 2, 3, 0, 0, 0 }, 3, new int[] { 2, 5, 6 }, 3);
    }
}
