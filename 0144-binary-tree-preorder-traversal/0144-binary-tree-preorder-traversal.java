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

    public void preOrder(List<Integer> li,TreeNode root){
        if(root == null){
            return;
        }
        li.add(root.val);
        preOrder(li,root.left);
        preOrder(li,root.right);
    }

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        st.add(root);
        while(!st.isEmpty()){
            TreeNode node = st.pop();               // Pop the top node directly
            ans.add(node.val);                      // Add its value

            if (node.right != null) st.push(node.right); 
            if (node.left != null) st.push(node.left);
        }
        return ans;
    }
}