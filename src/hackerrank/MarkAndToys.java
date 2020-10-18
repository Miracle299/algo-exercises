package hackerrank;

import java.util.Arrays;

public class MarkAndToys {

    public static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int i = 0;
        int currentVal = 0;
        while (k > 0) {
            k -= prices[i];
            currentVal = prices[i];
            i++;
            if (k < 0) {
                k += currentVal;
                i--;
                break;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(maximumToys(new int[]{1, 12, 5, 111, 200, 1000, 10}, 50));
    }
}
