package LeetCode;

public class LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        if (head==null || head.next==null) {
            return false;
        }
        ListNode fast = head.next, slow = head;
        while (fast!=slow && fast.next!=null && fast.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return fast == slow;
    }
}
