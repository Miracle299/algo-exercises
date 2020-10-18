package leetcode;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        int firstPointer = 0;
        int secondPointer = 3;
        int sumOfFirstTriplet = nums[0] + nums[1] + nums[2];
        int difference = Math.abs(target - sumOfFirstTriplet);

        while (secondPointer != nums.length) {
            int newSumOfTriplets = sumOfFirstTriplet - nums[firstPointer] + nums[secondPointer];
            int newDifference = Math.abs(target - difference);
            if (newDifference < difference) {
                difference = newDifference;
            }
            firstPointer++;
            secondPointer++;
        }

        return -1;
    }

    public static void main(String[] args) {
//        new ThreeSumClosest().threeSumClosest(new int[]{-1, 2, 1, -4}, 1);
        new ThreeSumClosest().threeSumClosest(new int[]{1, 1, 1, 0}, 0);
    }
}
