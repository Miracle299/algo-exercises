package leetcode;

public class UniquePaths {
    //DP solution
    public static int uniquePaths(int m, int n) {
        int[][] map = new int[m][n];

        for (int i = 0; i < m; i++) {
            map[i][0] = 1;
        }

        for (int i = 0; i < n; i++) {
            map[0][i] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                map[i][j] = map[i - 1][j] + map[i][j - 1];
            }
        }

        return map[m - 1][n - 1];
    }

    //math solution
    //https://betterexplained.com/articles/easy-permutations-and-combinations/
    public int uniquePathsComb(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }

        m--;
        n--;

        if (m < n) {
            m += n;
            n = m - n;
            m -= n;
        }

        long res = 1;
        int j = 1;

        for (int i = m + 1; i < m + n; i++, j++) {
            res *= i;
            res /= j;
        }

        return (int)res;
    }

    public static void main(String[] args) {
        uniquePaths(7,3);
    }
}
