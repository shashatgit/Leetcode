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
    int max = 0;
    public int height(TreeNode node){
        if (node == null) return 0;
        int l = 1 + height(node.left);
        int r = 1 + height(node.right);
        return Math.max(l,r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int leftDiameter = height(root.left);
        int rightDiameter = height(root.right);
        max = Math.max(max,leftDiameter + rightDiameter);
        diameterOfBinaryTree(root.left);
        diameterOfBinaryTree(root.right);

        return max;
    }
}