public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList();
        Queue<TreeNode> q = new LinkedList();
        if (root == null) return ans;
        
        q.offer(root);
        while (q.size() != 0) {
            int size = q.size();
            for (int i=0; i<size; i++) {
                TreeNode cur = q.poll();
                if (i == 0) ans.add(cur.val);
                if (cur.right != null) q.offer(cur.right);
                if (cur.left != null) q.offer(cur.left);
            }
            
        }
        return ans;
    }
}