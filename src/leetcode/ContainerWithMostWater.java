package leetcode;

public class ContainerWithMostWater {

    /**
     * Explanation:
     * <p>
     * 1. We use formula which help me find largest container
     * <code>(j - i) * min(a[i], a[j])</code>
     * <p>
     * We use two pointers one from start and another from the end of the array.
     */
    public static int maxArea(int[] height) {
        int result = 0;
        int i = 0;
        int j = height.length - 1;

        while (i < j) {
            result = Math.max(result, (j - i) * Math.min(height[i], height[j])); // площадь квадрата
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }
}
