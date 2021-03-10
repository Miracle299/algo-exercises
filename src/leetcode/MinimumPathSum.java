package leetcode;

import java.util.Arrays;

public class MinimumPathSum {
    public static int minPathSum(int[][] grid) {
        int[][] map = new int[grid.length][grid[0].length];
        map[0][0] = grid[0][0];

        for (int i = 0; i < grid.length - 1; i++) {
            map[0][i + 1] = map[0][i] + grid[0][i];
        }

        for (int i = 1; i < grid[0].length; i++) {
            map[i][0] += grid[i][0];
        }

//        printArr(grid);

        printArr(map);

        for (int i = 1; i < grid.length; i++) {
            for (int j = 1; j < grid[0].length; j++) {
                map[i][j] = Math.min(map[i - 1][j] + grid[i][j], map[i][j - 1] + grid[i][j]);
                printArr(map);
            }
        }

        return map[grid.length - 1][grid[0].length - 1];
    }

    private static void printArr(int[][] map) {
        System.out.println("");
        for (int[] arr : map) {
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void main(String[] args) {
        minPathSum(new int[][] { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 } });
    }
}
