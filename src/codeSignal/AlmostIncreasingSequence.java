package codeSignal;

public class AlmostIncreasingSequence {

    public boolean almostIncreasingSequence(int[] sequence) {
        int last = Integer.MIN_VALUE;
        int lastPrev = Integer.MIN_VALUE;
        int c = 0;

        for (int val : sequence) {
            if (val <= last) {
                c++;
                if (val > lastPrev) {
                    last = val;
                }
            } else {
                lastPrev = last;
                last = val;
            }
        }

        return c <= 1;
    }

    public static void main(String[] args) {
//        new AlmostIncreasingSequence().almostIncreasingSequence(new int[]{3, 6, 5, 8, 10, 20, 15});
        new AlmostIncreasingSequence().almostIncreasingSequence(new int[]{1, 3, 2, 1});
//        new AlmostIncreasingSequence().almostIncreasingSequence(new int[]{1, 2, 1, 2});
//        new AlmostIncreasingSequence().almostIncreasingSequence(new int[]{1, 3, 2});
    }
}
