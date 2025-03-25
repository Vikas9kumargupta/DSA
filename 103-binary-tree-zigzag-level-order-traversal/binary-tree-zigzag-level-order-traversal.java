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

        List<List<Integer>> list = new ArrayList<>();
        if(root == null) return list;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean lToR = true;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> ls = new ArrayList<>();
            for(int i = 0; i<size; i++){
                TreeNode node = q.poll();
                if(lToR){
                    ls.addLast(node.val);
                }else{
                    ls.addFirst(node.val);
                }
                if(node.left!=null) q.add(node.left);
                if(node.right != null) q.add(node.right);
            }
            list.add(ls);
            lToR = !lToR;
        }
        return list;
    }
}