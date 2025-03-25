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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> num = new ArrayList<>();
            for(int i = 0; i<size; i++){
                TreeNode temp = q.peek();
                if(temp.left != null) q.add(temp.left);
                if(temp.right!= null) q.add(temp.right);
                num.add(q.poll().val);
            }
            list.add(num);
        }
        return list;
    }
}