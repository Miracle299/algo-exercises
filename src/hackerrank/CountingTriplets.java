package hackerrank;

import java.util.*;

public class CountingTriplets {

    static long countTriplets(List<Long> arr, long r) {
        Map<Long, Long> left = new HashMap<>();
        Map<Long, Long> right = new HashMap<>();
        long triplets = 0;

        arr.stream().forEach(val -> right.compute(val, (k, v) -> right.getOrDefault(val, 0L) + 1));

        for (int i = 0; i < arr.size(); i++) {
            right.computeIfPresent(arr.get(i), (k, v) -> v - 1);
            if (arr.get(i) % r == 0) {
                triplets += left.getOrDefault(arr.get(i) / r, 0L) * right.getOrDefault(arr.get(i) * r, 0L);
            }
            long val = arr.get(i);
            left.compute(val, (k, v) -> left.getOrDefault(val, 0L) + 1);
        }

        return triplets;
    }
}
