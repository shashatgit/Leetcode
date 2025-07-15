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
    public boolean isPalindrome(ListNode head) {
        ListNode itr = head;
        ListNode temp = head;
        int len = 0;
        int count = 0;
        Stack<Integer> stk= new Stack<>();
        while (temp != null)
        {
            len++;
            temp = temp.next;
        }
        if (len == 1)
        {
            return true;
        }
        while (count < len/2)
        {
            stk.push(itr.val);
            count++;
            itr = itr.next;
        }
        if (len%2 != 0) itr = itr.next;
        while (itr != null)
        {
            int val = stk.pop();
            if (val != itr.val)
            {
                return false;
            }
            itr = itr.next;
            count--;
        }

        return true;

    }
}