package leetcode;

public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] A, int K) {
        int i = 0;
        int j;

        for (j = 0; j < A.length; ++j) {
            if (A[j] == 0)
                K--;
            if (K < 0 && A[i++] == 0)
                K++;
        }
        return j - i;
    }

    public static void main(String[] args) {
        new MaxConsecutiveOnesIII().longestOnes(new int[] { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 }, 2); //6
        new MaxConsecutiveOnesIII().longestOnes(new int[] { 1, 1, 1, 0, 0, 0, 1, 1, 1, 1 }, 0); //4
    }
}
