package leetcode;

public class RotateArray {

    //with extra space
    public static void rotate(int[] A, int k) {
        int N = A.length;
        int[] result = new int[N];

        for (int i = 0; i < N; i++) {
            result[(i + k) % A.length] = A[i];
        }
    }

    //without extra space (using reversing)
    public static void rotate1(int[] A, int k) {
        k %= A.length;
        reverse(A, 0, A.length - 1);
        reverse(A, 0, k - 1);
        reverse(A, k, A.length - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }


    public static void main(String[] args) {
        rotate1(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
        rotate1(new int[] { 2, 1 }, 1);
        rotate1(new int[] { 1, 2 }, 3);
        rotate(new int[] { -1, -100, 3, 99 }, 2);
    }
}
