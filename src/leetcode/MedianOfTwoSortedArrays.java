package leetcode;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        int firstLen = nums1.length;
        int secondLen = nums2.length;
        int divider = 0;

        if (firstLen % 2 == 1) {
            divider += 1;
            int index = firstLen / 2;
            result += nums1[index];
        } else if (firstLen == 0) {
            result += 0;
        } else {
            divider += 2;
            int index = firstLen / 2 - 1;
            result += nums1[index] + nums1[index + 1];
        }

        if (secondLen % 2 == 1) {
            divider += 1;
            int index = secondLen / 2;
            result += nums2[index];
        } else if (secondLen == 0) {
            result += 0;
        } else {
            divider += 2;
            int index = secondLen / 2 - 1;
            result += nums2[index] + nums2[index + 1];
        }
        System.out.println(result / divider);
        return result / divider;
    }

    public static void main(String[] args) {
//        findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});
        findMedianSortedArrays(new int[]{3}, new int[]{-2, -1});
    }
}
