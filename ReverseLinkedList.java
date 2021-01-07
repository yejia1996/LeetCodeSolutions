package LeetCode;

public class ReverseLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
        // 迭代
//        ListNode pre = null;
//        ListNode cur = head;
//        while (cur != null) {
//            ListNode next = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = next;
//        }
//        return pre;

        // 递归 以 1->2->3->4->5->null 为例
        if (head == null) { return head; }
        // 递归的终止条件：head.next = null
        if (head.next == null) { return head; }
        // cur永远为递归终止时的节点
        ListNode cur = reverseList(head.next);
        // 建立5->4
        head.next.next = head;
        // 断开4->5
        head.next = null;
        return cur;
    }
}
