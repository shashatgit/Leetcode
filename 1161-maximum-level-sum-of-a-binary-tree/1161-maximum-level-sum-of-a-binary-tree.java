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
    public int maxLevelSum(TreeNode root) {
        int ans = 1;
        int max = root.val;
        int level = 1;
        Queue<ArrayList<TreeNode>> q = new LinkedList<ArrayList<TreeNode>>();
        ArrayList<TreeNode> first = new ArrayList<TreeNode>();
        first.add(root);
        q.offer(first);

        while(!q.isEmpty())
        {
            int sum = 0;
            ArrayList<TreeNode> thisLevel = q.poll();
            if(thisLevel.size() == 0) break;
            ArrayList<TreeNode> nextLevel = new ArrayList<TreeNode>();


            for(int i = 0; i < thisLevel.size(); i++)
            {
               sum += thisLevel.get(i).val;
               if(thisLevel.get(i).left != null) nextLevel.add(thisLevel.get(i).left);
               if(thisLevel.get(i).right != null) nextLevel.add(thisLevel.get(i).right);
            }
            if(sum > max)
            {
                max = sum;
                ans = level;
            }
            level++;
            q.offer(nextLevel);
        }
        return ans;
    }
}