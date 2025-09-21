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
    public static int helper(TreeNode root ,int[] max){
        if(root == null) return 0;
        int left = helper(root.left,max);
        int right = helper(root.right,max);
        max[0]=Math.max(max[0],left+right);
        return 1+Math.max(left,right);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        int[] min= new int[1];
        helper(root,min);
        return min[0];
    }
}