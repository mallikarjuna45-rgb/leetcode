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
    public static int height(TreeNode node){
        if(node == null) return 0;
        return 1+Math.max(height(node.left),height(node.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root  == null) return true;
        int left = height(root.right);
        int right  = height(root.left);
        if(Math.abs(left -right)>1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
}