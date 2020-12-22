package leetcode;

import java.util.Arrays;

public class SquaresOfASortedArray {
    //My solution
    public static int[] sortedSquares(int[] nums) {
        return Arrays.stream(nums).map(num -> (int) Math.pow(num, 2)).sorted().toArray();
    }

    public static int[] sortedSquares2(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int a = 0;
        int b = len - 1;

        for (int p = len - 1; p >= 0; p--) {
            if (Math.abs(nums[a]) > Math.abs(nums[b])) {
                res[p] = nums[a] * nums[a];
                a++;
            } else {
                res[p] = nums[b] * nums[b];
                b--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
//        Arrays.toString(sortedSquares(new int[] { -4, -1, 0, 3, 10 }));
        Arrays.toString(sortedSquares2(new int[] { -4, -1, 0, 3, 10 }));
    }
}
