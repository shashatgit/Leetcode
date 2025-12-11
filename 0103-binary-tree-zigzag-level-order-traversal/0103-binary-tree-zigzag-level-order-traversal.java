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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) return new ArrayList<List<Integer>>();
        boolean flag = true;
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int ele = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0; i < ele; i++)
            {
                if(flag)
                {
                    if(q.peek().right != null) q.offer(q.peek().right);
                    if(q.peek().left != null) q.offer(q.peek().left);
                    level.add(q.poll().val);
                }
                else
                {
                    if(q.peek().left != null) q.offer(q.peek().left);
                    if(q.peek().right != null) q.offer(q.peek().right);
                    level.add(q.poll().val);
                }
                
            }
            flag = !flag;
            ans.add(level);
        }
        return ans;
    }
}