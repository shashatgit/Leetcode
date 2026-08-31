/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {number[]}
 */
var nodesBetweenCriticalPoints= function(head) {

    const arr = [];
    
    let i = head
    let j = head.next
    let index = 0;

     while (j.next) {
        if ((j.val > i.val && j.val > j.next.val) || (j.val < i.val && j.val < j.next.val)) {
            arr.push(index);
        }
        i = j;
        j = j.next;
        index++;
    }
    
    if (arr.length < 2) 
    {
        return [-1, -1];
    }

    let minDist = Infinity;
    for (let i = 1; i < arr.length; i++) 
    {
        minDist = Math.min(minDist, arr[i] - arr[i - 1]);
    }
    const maxDist = arr[arr.length - 1] - arr[0];

    return [minDist, maxDist];

};