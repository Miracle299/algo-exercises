package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] num) {
        Arrays.sort(num);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < num.length - 2; i++) {
            if (num[i] > 0) {
                break;
            }
            if (i == 0 || (i > 0 && num[i] != num[i - 1])) {
                int low = i + 1;
                int high = num.length - 1;
                int sum = -num[i];

                while (low < high) {
                    if (num[low] + num[high] == sum) {
                        result.add(Arrays.asList(num[low], num[high], num[i]));
                        while (low < high && num[low] == num[low + 1]) low++;
                        while (low < high && num[high] == num[high - 1]) high--;
                        low++;
                        high--;
                    } else if (num[low] + num[high] < sum) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        threeSum(new int[]{-1, 0, 1, 2, -1, -4});
    }
}
