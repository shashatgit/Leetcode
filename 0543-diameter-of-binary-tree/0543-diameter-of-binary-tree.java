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
    public int height(TreeNode node){
        if (node == null) return 0;
        int l = 1 + height(node.left);
        int r = 1 + height(node.right);
        return Math.max(l,r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        int rootDiameter = height(root.right) + height(root.left);

        return Math.max(rootDiameter,Math.max(leftDiameter,rightDiameter));
    }
}