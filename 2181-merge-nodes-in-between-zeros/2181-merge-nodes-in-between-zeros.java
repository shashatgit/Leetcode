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
    public ListNode mergeNodes(ListNode head) {
        ListNode curr = head;
        ListNode temp = head.next;
        int sum = 0;
        while(temp != null)
        {
            if(temp.val == 0)
            {
                ListNode neo = new ListNode(sum);
                sum = 0;
                curr.next = neo;
                curr = neo;
            }
            sum += temp.val;
            temp = temp.next;
        }
        return head.next;
    }
}