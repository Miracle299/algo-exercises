package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Combinations {

    private final List<List<Integer>> possibleCombinations = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        findCombinations(n, new ArrayList<>(), 1, k);
        return possibleCombinations;
    }

    private void findCombinations(int n, List<Integer> combination, int startPoint, int k) {
        if (k == 0) {
            possibleCombinations.add(new ArrayList<>(combination));
            return;
        }
        for (int i = startPoint; i <= n; i++) {
            combination.add(i);
            findCombinations(n, combination, i + 1, k - 1);
            combination.remove(combination.size() - 1);
        }
    }

    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        System.out.println(combinations.combine(4, 2));
    }
}
