/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode slow = headA;
        ListNode fast = headB;
        while (slow != null)
        {
            while (fast != null)
            {
                if (fast == slow)
                {
                    return slow;
                }
                fast = fast.next;
            }
            slow = slow.next;
            fast = headB;
        }
        return null;
    }
}