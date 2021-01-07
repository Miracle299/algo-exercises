package leetcode;

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;
        int[] left = new int[N];
        left[0] = 1;
        int[] right = new int[N];
        right[N - 1] = 1;
        int[] result = new int[N];

        for (int i = 1; i < N; i++) {
            left[i] = left[i - 1] * nums[i - 1];
        }

        for (int i = N - 2; i >= 0; i--) {
            right[i] = right[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < N; i++) {
            result[i] = left[i] * right[i];
        }
        return result;
    }

    //without extra space
    public int[] productExceptSelf1(int[] nums) {
        int N = nums.length;
        int[] result = new int[N];
        result[0] = 1;

        for (int i = 1; i < nums.length; i++) {
            result[i] = result[i - 1] * nums[i - 1];
        }

        int R = 1;
        for (int i = N - 1; i >= 0; i--) {
            result[i] = R * result[i];
            R *= nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        new ProductOfArrayExceptSelf().productExceptSelf(new int[] {1,2,3,4});
    }
}
