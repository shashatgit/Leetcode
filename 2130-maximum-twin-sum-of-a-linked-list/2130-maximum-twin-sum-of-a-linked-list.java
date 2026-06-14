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
    public int pairSum(ListNode head) {
        if (head == null) return 0;
        if (head.next.next == null) return head.val + head.next.val;
        int maxSum = 0;
        Stack<Integer> stk = new Stack<>();
        ListNode fast = head.next.next;
        ListNode slow = head;
        while (fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode itr = slow.next;
        while(itr != null)
        {
            stk.push(itr.val);
            itr = itr.next;
        }
        ListNode left = head;
        while(!stk.isEmpty())
        {
            int check = stk.pop();
            maxSum = Math.max(maxSum, check + left.val);
            left = left.next;
        }
        return maxSum;
    }
}