package codeSignal;

import java.util.Arrays;

public class MakeArrayConsecutive2 {
    public int makeArrayConsecutive2(int[] statues) {
        if (statues.length == 1) {
            return 0;
        }

        int counter = 0;
        Arrays.sort(statues);

        for (int i = statues.length - 1; i > 0; i--) {
            if (statues[i] - statues[i - 1] > 1) {
                counter += (statues[i] - statues[i - 1]) - 1;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        new MakeArrayConsecutive2().makeArrayConsecutive2(new int[]{6, 2, 3, 8});
    }
}
