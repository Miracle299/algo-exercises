package algo;

import java.util.Arrays;

public class InsertionSort {
    public static void sortAsc(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];

            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }

            array[i + 1] = value;
        }
    }

    public static void sortDesc(int[] array) {
        for (int left = 0; left < array.length; left++) {
            int value = array[left];

            int i = left - 1;
            for (; i >= 0; i--) {
                if (value > array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }

    public static void main(String[] args) {
        int[] array = { 10, 2, 10, 3, 1, 2, 5 };
        sortDesc(array);
        System.out.println(Arrays.toString(array));
    }
}
