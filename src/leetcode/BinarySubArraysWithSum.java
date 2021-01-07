package leetcode;

public class BinarySubArraysWithSum {

    //time complexity O(n)
    public static int numSubArraysWithSum(int[] A, int S) {
        if (S > A.length) {
            return -1;
        }
        int res = 0;
        int first = 0;
        int second = 0;
        int sum = 0;

        while (second < A.length) {
            sum += A[second];
            while (first < second && sum > S) {
                sum -= A[first++];
            }
            if (sum == S) {
                res++;
            }
            for (int i = first; i < second && sum == S && A[first] == 0; i++) {
                res++;
            }
            second++;
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        numSubArraysWithSum(new int[] { 1, 0, 1, 0, 1 }, 2); //4
        numSubArraysWithSum(new int[] { 1, 0, 0 ,0 }, 1); //4
        numSubArraysWithSum(new int[] {1}, 1); //1
        numSubArraysWithSum(new int[] {0,0,0,0,0}, 2); //0
        numSubArraysWithSum(new int[] {0,0,0,0,0}, 0); //15
        numSubArraysWithSum(new int[] {1,0,0,0,1}, 2); //1
        numSubArraysWithSum(new int[] {1,0,0,0,1}, 1); //8

    }
}
