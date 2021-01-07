package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedList {
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        ListNode cur = head;
        if (cur != null) {
            vals.add(cur.val);
            cur = head.next;
        }

        int left = 0;
        int right = vals.size()-1;
        while (left < right) {
            if (!vals.get(left).equals(vals.get(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
