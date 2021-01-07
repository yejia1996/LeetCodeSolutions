package LeetCode;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class ListNodeTest {
    public static void demo(ListNode LN) {
        System.out.println("secondNode 的值为："+LN.next.next.val);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode firstNode = new ListNode(1);
        ListNode secondNode = new ListNode(2);
        ListNode thirdNode = new ListNode(3);
        head.val = 1;
        head.next = firstNode;
        firstNode.next = secondNode;
        secondNode.next = thirdNode;
        demo(head);
    }

//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//
//
//
//        return null;
//    }
}
