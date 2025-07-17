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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        if (head.next == null) return null;
        ListNode temp = head;
        ListNode lag = head;
        int count = 0;
        while (temp !=null && count <= n)
        {
            temp = temp.next;
            count++;
        }
        while(temp != null)
        {
            temp = temp.next;
            lag = lag.next;
            count++;
        }
        if (count == n) return lag.next;
        lag.next = lag.next.next;
        return head;
    }
}