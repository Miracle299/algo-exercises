package hackerrank;

public class LoveLetterMystery {
    static int theLoveLetterMystery(String s) {
        char[] sArr = s.toCharArray();
        int lastIndex = sArr.length - 1;
        int res = 0;
        for (int i = 0; i < sArr.length / 2; i++) {
            res += Math.abs(sArr[lastIndex] - sArr[i]);
            lastIndex--;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("cba"));
    }
}
