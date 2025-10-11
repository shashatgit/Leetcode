/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int max = Integer.MIN_VALUE;
    public int maxFind(TreeNode node) {
        if (node == null) return 0;
        int leftSum = Math.max(0,maxFind(node.left));
        int rightSum = Math.max(0,maxFind(node.right));
        max = Math.max(max,node.val+leftSum+rightSum);
        return node.val + Math.max(leftSum,rightSum);
    } 
    public int maxPathSum(TreeNode root) {
        max = root.val;
        int calc = maxFind(root);
        return max;
    }
}