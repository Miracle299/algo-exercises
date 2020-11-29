package leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HIndex {
    public int hIndex(int[] citations) {
        List<Integer> list = Arrays.stream(citations).boxed().collect(Collectors.toList());
        list.sort(Collections.reverseOrder());
        int index = 0;

        for (int i = 0; i < citations.length; i++) {
            if (i < list.get(i) && list.get(i) > 0) {
                index = i + 1;
            }
            if (i == list.get(i) - 1) {
                return list.get(i);
            }
        }
        return index;
    }

    public static void main(String[] args) {
        new HIndex().hIndex(new int[] { 3,0,6,1,5 });
    }
}
