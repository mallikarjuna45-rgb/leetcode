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
    public static int helper(TreeNode node){
        if(node == null){
            return 0;
        }
        int left_height = helper(node.left);
        if(left_height == -1) return -1;  
        int right_height = helper(node.right);
        if(right_height == -1) return -1;
        if(Math.abs(left_height-right_height)>1){
            return -1;
        }
        return 1+Math.max(left_height , right_height);
    }
    public boolean isBalanced(TreeNode root) {
       return helper(root)!=-1;
    }
}