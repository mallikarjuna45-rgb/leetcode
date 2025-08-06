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
    public static void preOrder(TreeNode root,List<Integer> li){

        if(root == null){
            return;
        }
        li.add(root.val);
        preOrder(root.left,li);
        preOrder(root.right,li);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null)return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> s = new Stack<>();
        s.add(root);
        while(!s.isEmpty()){
            TreeNode node = s.pop();
            if(node.right!=null) s.push(node.right);
            if(node.left!=null) s.push(node.left);
            ans.add(node.val);
        }
        return ans;
    }
}