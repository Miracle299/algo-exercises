package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        System.out.println(result);
        return result;
    }

    private void backtrack(List<String> result, String combo, int open, int close, int length) {
        if (combo.length() == length * 2) {
            result.add(combo);
            return;
        }

        if (open < length) {
            backtrack(result, combo + "(", open + 1, close, length);
        }

        if (close < open) {
            backtrack(result, combo + ")", open, close + 1, length);
        }
    }

    public static void main(String[] args) {
        new GenerateParentheses().generateParenthesis(3);
    }
}
