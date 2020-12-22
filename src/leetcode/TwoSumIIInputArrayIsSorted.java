package leetcode;

public class TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int a = 0;
        int b = numbers.length - 1;

        while (a < b) {
            if (numbers[a] + numbers[b] > target) {
                b--;
            } else if (numbers[a] + numbers[b] < target) {
                a++;
            } else {
                break;
            }
        }

        return new int[] { a + 1, b + 1 }; //because counting start from 1
    }

    public static void main(String[] args) {
        new TwoSumIIInputArrayIsSorted().twoSum(new int[] { 2, 7, 11, 15 }, 9);
    }
}
