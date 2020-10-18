package codeSignal;

public class AdjacentElementsProduct {
    static int adjacentElementsProduct(int[] inputArray) {
        if (inputArray.length == 0) {
            return 0;
        }
        int temp = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length - 1; i++) {
            int tempVar = inputArray[i] * inputArray[i + 1];
            if (temp < tempVar) {
                temp = tempVar;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(adjacentElementsProduct(new int[]{-23, 4, -3, 8, -12}));
    }
}
