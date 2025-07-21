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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (head.next == null) return head;
        if (k == 0) return head;
        ListNode tail = head;
        ListNode hinge = head;
        int len = 1;
        int count = 1;
        while (tail.next != null)
        {
            tail = tail.next;
            len++; 
        }
        if (k%len == 0) return head;
        while (count < len - (k % len))
        {
            hinge = hinge.next;
            count++;
        }
        ListNode newHead = hinge.next;
        tail.next = head;
        hinge.next = null;
        return newHead;
    }
}