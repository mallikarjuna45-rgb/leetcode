class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int maxLevel = 1;
        int maxSum = root.val;
        int level = 1;
        
        q.offer(root);
        
        while (!q.isEmpty()) {
            int size = q.size();
            int levelSum = 0;  // sum for this level
            
            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                
                levelSum += node.val;  
                
                if (node.left != null) q.add(node.left);
                if (node.right != null) q.add(node.right);
            }
            
            if (levelSum > maxSum) {
                maxSum = levelSum;
                maxLevel = level;
            }
            
            level++;
        }
        return maxLevel;
    }
}
