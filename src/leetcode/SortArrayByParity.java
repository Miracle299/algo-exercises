package leetcode;

public class SortArrayByParity {
    //two pass solution complexity O(n), space O(n)
    public static int[] sortArrayByParity(int[] A) {
        int[] result = new int[A.length];
        int index = 0;

        for (int k : A) {
            if (k % 2 == 0) {
                result[index++] = k;
            }
        }

        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] % 2 == 1) {
                result[index++] = A[i];
            }
        }
        return result;
    }

    //without extra space
    public static int[] sortByParity2(int[] A) {
        int i = 0;
        int j = A.length - 1;

        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {
                int temp = A[j];
                A[j] = A[i];
                A[i] = temp;
            }
            if (A[i] % 2 == 0) {
                i++;
            }
            if (A[j] % 2 == 1) {
                j--;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        sortArrayByParity(new int[] { 3, 1, 2, 4 });//[2,4,3,1]
    }
}
