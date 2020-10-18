package leetcode;

import java.util.*;

public class LetterCombinationsOfPhoneNumber {
    Map<String, String> phone = new HashMap<>() {{
        put("2", "abc");
        put("3", "def");
        put("4", "ghi");
        put("5", "jkl");
        put("6", "mno");
        put("7", "pqrs");
        put("8", "tuv");
        put("9", "wxyz");
    }};

    List<String> possibleCombinations = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.isBlank() || digits.isEmpty()) {
            return possibleCombinations;
        }
        findCombinations("", digits);
        return possibleCombinations;
    }

    private void findCombinations(String combination, String digits) {
        if(digits.length() == 0) {
            possibleCombinations.add(combination);
        } else {
            String digit = digits.substring(0,1);
            String letters = phone.get(digit);
            for(int i = 0; i < letters.length(); i++) {
                String letter = phone.get(digit).substring(i, i+1);
                findCombinations(combination + letter, digits.substring(1));
            }
        }
    }

    public static void main(String[] args) {
        LetterCombinationsOfPhoneNumber clazz = new LetterCombinationsOfPhoneNumber();
        List<String> list = clazz.letterCombinations("23");
        System.out.println(list);
    }
}
