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
    public List<Integer> preorderTraversal(TreeNode root) {
        TreeNode node = root;
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> right = new Stack<>();
        while(node!= null)
        {
            ans.add(node.val);
            if(node.right != null)
            {
                right.push(node.right);
            }
            node = node.left;
            if(node == null && !right.isEmpty())
            {
                node = (right.pop());
            }
        }
        return ans;
    }
}