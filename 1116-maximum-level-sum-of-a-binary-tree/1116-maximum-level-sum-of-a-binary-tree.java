class Solution {
    private Map<Integer, Integer> levelSumMap = new HashMap<>();
    
    public int maxLevelSum(TreeNode root) {
        dfs(root, 1);
        
        int maxLevel = 1;
        int maxSum = levelSumMap.get(1);
        
        for (int level : levelSumMap.keySet()) {
            int sum = levelSumMap.get(level);
            if (sum > maxSum) {
                maxSum = sum;
                maxLevel = level;
            }
        }
        return maxLevel;
    }
    
    private void dfs(TreeNode node, int level) {
        if (node == null) return;
        
        levelSumMap.put(level, levelSumMap.getOrDefault(level, 0) + node.val);
        
        dfs(node.left, level + 1);
        dfs(node.right, level + 1);
    }
}
