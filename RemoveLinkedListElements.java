package LeetCode;

public class RemoveLinkedListElements {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode header = new ListNode(0);
        header.next = head;

        ListNode cur = header;
        while (cur.next!=null) {
            if (cur.next.val==val) {
                cur.next = cur.next.next;
            }
            // 此处不能省略else，否则默认执行cur = cur.next
            else {
                cur = cur.next;
            }
        }
        return header.next;
    }
}
