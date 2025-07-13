/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int c = 0;
        int h = 0;
        ListNode head = null;
        ListNode prev = null;
        while (l1 != null && l2 != null)
        {
            int sum = l1.val + l2.val + c;
            if (sum > 9) c = 1;
            else c = 0;

            if (h == 0)
            {
                ListNode temp = new ListNode(sum%10);
                head = temp;
                prev = head;
                h = 1;
                l1 = l1.next;
                l2 = l2.next;
                continue;
            }
            ListNode curr = new ListNode(sum%10);
            prev.next = curr;
            prev = prev.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null)
        {
            while (l2 != null)
            {
                int sum = l2.val + c;
                if (sum > 9) c = 1;
                else c = 0;
                ListNode curr = new ListNode(sum%10);
                prev.next = curr;
                prev = prev.next;
                l2 = l2.next;
            }
        }
        if (l2 == null)
        {
            while (l1 != null)
            {
                int sum = l1.val + c;
                if (sum > 9) c = 1;
                else c = 0;
                ListNode curr = new ListNode(sum%10);
                prev.next = curr;
                prev = prev.next;
                l1 = l1.next;
            }
        }
        if (c == 1)
        {
            ListNode curr = new ListNode(1);
            prev.next = curr;
            prev = prev.next;
        }
        return head;

    }
}