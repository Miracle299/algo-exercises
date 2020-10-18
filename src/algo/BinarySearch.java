package algo;

public class BinarySearch {
    public int binarySearch(int[] sortedArray, int target, int low, int high) {
        int middle = (low + high) / 2;

        if (high < low) {
            return -1;
        }

        if (target == sortedArray[middle]) {
            return middle;
        } else if (target < sortedArray[middle]) {
            return binarySearch(sortedArray, target, low, high - 1);
        } else {
            return binarySearch(sortedArray, target, low + 1, high);
        }
    }

    public static void main(String[] args) {
        System.out.println(new BinarySearch().binarySearch(new int[]{1,2,3,4,5,6,7,8,100}, 100, 0, 8));
    }
}
