package hackerrank;

public class CommonChild {

    static int commonChild(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();
        int[][] matrix = new int[s1Length + 1][s2Length + 2];

        for (int i = 0; i <= s1Length; i++) {
            for (int j = 0; j <= s2Length; j++) {
                if (i == 0 || j == 0) {
                    matrix[i][j] = 0;
                } else if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    matrix[i][j] = matrix[i - 1][j - 1] + 1;
                } else {
                    matrix[i][j] = Math.max(matrix[i][j - 1], matrix[i - 1][j]);
                }
            }
        }
        return matrix[s1Length][s2Length];
    }

    public static void main(String[] args) {
        System.out.println(commonChild("OUDFRMYMAW", "AWHYFCCMQX"));
        System.out.println(commonChild("HARRY", "SALLY"));
    }
}
