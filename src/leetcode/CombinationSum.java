package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    private final List<List<Integer>> possibleCombinations = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(new ArrayList<>(), candidates, target, 0);
        return possibleCombinations;
    }

    private void helper(List<Integer> combination, int[] candidates, int target, int index) {
        if (target == 0) {
            possibleCombinations.add(new ArrayList<>(combination));
            return;
        } else if (index >= candidates.length) {
            return;
        }
        helper(combination, candidates, target, index + 1);
        if (target - candidates[index] >= 0) {
            combination.add(candidates[index]);
            target -= candidates[index];
            helper(combination, candidates, target, index);
            combination.remove((Integer) candidates[index]);
        }
    }

    public static void main(String[] args) {
        new CombinationSum().combinationSum(new int[]{2, 3, 6, 7}, 7);
    }
}
