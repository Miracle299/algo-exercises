package codeSignal;

public class MatrixElementsSum {
    public int matrixElementsSum(int[][] matrix) {
        int res = 0;
        int j = 0;
        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < matrix[0].length; i++) {
            while (j < matrix.length) {
                if (matrix[j][i] != 0 && prev != 0) {
                    res += matrix[j][i];
                }
                prev = matrix[j][i];
                j++;
            }
            prev = Integer.MIN_VALUE;
            j = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        new MatrixElementsSum().matrixElementsSum(new int[][]{{1, 1, 1, 0},
                                                              {0, 5, 0, 1},
                                                              {2, 1, 3, 10}
        });
    }
}
