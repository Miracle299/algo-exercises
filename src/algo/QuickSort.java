package algo;

public class QuickSort {
    public void quickSort(int[] arr) {
        int begin = 0;
        int end = arr.length - 1;
        sort(arr, begin, end);
    }

    private void sort(int[] arr, int begin, int end) {
        if (begin < end) {
            int partitionIndex = partitionIndex(arr, begin, end);
            sort(arr, begin, partitionIndex - 1);
            sort(arr, partitionIndex + 1, end);
        }
    }

    private int partitionIndex(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = begin - 1;

        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;

                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }

        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;

        return i + 1;
    }

    public static void main(String[] args) {
        new QuickSort().quickSort(new int[]{10, 6, 8, 5, 7, 3, 4});
    }
}
