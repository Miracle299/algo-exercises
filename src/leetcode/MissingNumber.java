package leetcode;

public class MissingNumber {
    public static int missingNumber(int[] A) {
        int N = A.length;
        int sum = N * (N + 1) / 2;
        int expectedSum = 0;

        for (int j : A) {
            sum += j;
        }
        return expectedSum - sum;
    }

    public static void main(String[] args) {
        System.out.println(missingNumber(new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 }));
    }
}
