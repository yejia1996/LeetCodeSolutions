package LeetCode;
// 递归，每一层调用都返回排序好的链表头
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode L1, ListNode L2) {
        if (L1 == null) {
            return L2;
        }
        if (L2 == null) {
            return L1;
        }
        if (L1.val >= L2.val) {
            L2.next = mergeTwoLists(L1, L2.next);
            return L2;
        } else {
            L1.next = mergeTwoLists(L1.next, L2);
            return L1;
        }
    }
}
