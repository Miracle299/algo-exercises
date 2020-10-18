package hackerrank;

public class BubbleSort {
    static void countSwaps(int[] arr) {
        int counter = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    counter++;
                }
            }
        }
        System.out.println("Array is sorted in " + counter + " swaps.");
        System.out.println("First Element: " + arr[0]);
        System.out.println("Last Element: " + arr[arr.length - 1]);
    }

    private static void swap(int first, int second) {
        int i = 0;
        i = first;
        first = second;
        second = i;
    }

    public static void main(String[] args) {
        countSwaps(new int[]{4, 2, 3, 1});
    }
}
