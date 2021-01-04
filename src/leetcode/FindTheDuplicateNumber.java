package leetcode;

public class FindTheDuplicateNumber {
    //without sort
    //without extra space
    //less than n2
    public int findDuplicate(int[] A) {
        int ASum = 0;
        int nArraySum = 0;

        for (int i = 1; i <= A.length; i++) {
            nArraySum += i;
        }

        for (int j : A) {
            ASum += j;
        }

        return ASum - nArraySum;
    }

    public static void main(String[] args) {
        new FindTheDuplicateNumber().findDuplicate(new int[] { 1, 3, 4, 2, 2 });
        new FindTheDuplicateNumber().findDuplicate(new int[] { 1, 1, 2 });
    }
}
