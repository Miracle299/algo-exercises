package leetcode;

public class CountNumberOfNiceSubArrays {
    public static int numberOfSubArrays(int[] nums, int k) {
        int result = 0;
        int sum = 0;
        int[] visited = new int[nums.length + 1];
        visited[0] = 1;

        for (int num : nums) {
            sum += num % 2 == 1 ? 1 : 0;
            visited[sum] += 1;
            result += sum >= k ? visited[sum - k] : 0;
        }
        return result;
    }

    public static void main(String[] args) {
        numberOfSubArrays(new int[] { 1, 1, 2, 1, 1 }, 3); // 2
        numberOfSubArrays(new int[] { 2, 4, 6 }, 1); // 0
        numberOfSubArrays(new int[] { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 }, 2);//16
    }
}
