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
    int flag = 1;
    public int check(TreeNode node){
        if(node == null) return 0;
        int left = 1 + check(node.left);
        int right = 1 + check(node.right);
        if(Math.abs(left-right) > 1){
            flag = 0;
            return 0;
        }
        return Math.max(left,right);
    }
    public boolean isBalanced(TreeNode root) {
        check(root);
        return flag==1?true:false;
    }
}