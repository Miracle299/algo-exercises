package leetcode;

public class RemoveElements {
    public static int removeElement(int[] nums, int val) {
        int arrayLength = nums.length;
        int startIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                int temp = nums[startIndex];
                nums[startIndex] = nums[i];
                nums[i] = temp;
                startIndex++;
            } else {
                arrayLength--;
            }
        }
        return arrayLength;
    }

    public static void main(String[] args) {
        removeElement(new int[]{3, 2, 2, 3}, 3);
    }
}
