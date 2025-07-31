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
    public int gcdFinder(int uno, int dos)
    {
        if (dos == 0)
        {
            return uno;
        }
        return gcdFinder(dos, uno % dos);
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode uno = head;
        ListNode dos = head.next;
        while (dos != null)
        {
            ListNode gcd = new ListNode();
            gcd.val = gcdFinder(uno.val,dos.val);
            uno.next = gcd;
            gcd.next = dos;
            uno = dos;
            dos = uno.next;
        }
        return head;
    }
}