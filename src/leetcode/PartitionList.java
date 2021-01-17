package leetcode;

public class PartitionList {

    public static ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode result = new ListNode();
        findLower(result, head, head, x);
        removeZero(result);
        return result;
    }

    private static void findLower(ListNode result, ListNode input, ListNode copyHead, int x) {
        if (input == null) {
            findGreater(result, copyHead, x);
            return;
        }

        if (input.val < x) {
            result.val = input.val;
            result.next = new ListNode();
            findLower(result.next, input.next, copyHead, x);
            return;
        }
        findLower(result, input.next, copyHead, x);
    }

    private static void findGreater(ListNode result, ListNode input, int x) {
        if (input == null) {
            return;
        }

        if (input.val >= x) {
            result.val = input.val;
            result.next = new ListNode();
            findGreater(result.next, input.next, x);
            return;
        }
        findGreater(result, input.next, x);
    }

    private static void removeZero(ListNode result) {
        if (result.next.next == null) {
            result.next = null;
            return;
        }
        removeZero(result.next);
    }

    public static void main(String[] args) {
        partition(new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5, new ListNode(2)))))), 3);
    }
}
