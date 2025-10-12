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
    int currMax = 0;
    public int max (TreeNode node, int curr) {
        if (node == null) return 0;
        int lh = max(node.left,currMax);
        int rh = max(node.right,currMax);
        currMax = Math.max(currMax,lh+rh);
        return 1 + Math.max(lh,rh);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int ans = max(root,currMax);
        return currMax;
    }
}