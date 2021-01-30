package leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] nums) {
        List<Integer> result = new ArrayList<>();

        int rowStart = 0;
        int rowEnd = nums.length - 1;
        int columnStart = 0;
        int columnEnd = nums[0].length - 1;

        while (rowStart <= rowEnd && columnStart <= columnEnd) {
            for (int i = columnStart; i <= columnEnd; i++) {
                result.add(nums[columnStart][i]);
            }
            rowStart++;

            for (int i = rowStart; i <= rowEnd; i++) {
                result.add(nums[i][columnEnd]);
            }
            columnEnd--;

            if (rowStart <= rowEnd) {
                for (int i = columnEnd; i >= columnStart; i--) {
                    result.add(nums[rowEnd][i]);
                }
            }
            rowEnd--;

            if (columnStart <= columnEnd) {
                for (int i = rowEnd; i >= rowStart; i--) {
                    result.add(nums[i][columnStart]);
                }
            }
            columnStart++;
        }
        return result;
    }
}
