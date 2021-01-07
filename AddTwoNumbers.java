package LeetCode;

public class AddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers(ListNode L1, ListNode L2) {
    ListNode answer = new ListNode(0);
    ListNode cur = answer;
    int x, y, flagNow = 0, flagNext = 0, temp;
    while (L1!=null || L2!=null) {
        x = L1==null? 0 : L1.val;
        y = L2==null? 0 : L2.val;
        flagNow = flagNext;
        if (x+y>=10) {
            flagNext = 1;
            temp = x+y-10;
        } else {
            flagNext = 0;
            temp = x+y;
        }
        cur.next = new ListNode(temp+flagNow);
        cur = cur.next;
        L1 = L1==null ? null: L1.next;
        L2 = L2==null ? null: L2.next;
    }
    if (flagNext==1) {
        cur.next = new ListNode(1);
    }
    return answer.next;
    }
}