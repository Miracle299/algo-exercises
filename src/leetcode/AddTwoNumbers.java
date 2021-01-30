package leetcode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        recursion(result, l1, l2, 0);
        return result.next;
    }

    private static void recursion(ListNode result, ListNode first, ListNode second, Integer carry) {
        if (first != null || second != null) {
            int x = first != null ? first.val : 0;
            int y = second != null ? second.val : 0;
            int sum = carry + x + y;
            int residue = sum / 10;
            result.next = new ListNode(sum % 10);
            if (first != null && second != null) {
                recursion(result.next, first.next, second.next, residue);
            } else if (first != null) {
                recursion(result.next, first.next, second, residue);
            } else {
                recursion(result.next, first, second.next, residue);
            }
        } else if (carry > 0) {
            result.next = new ListNode(carry);
        }
    }
}
