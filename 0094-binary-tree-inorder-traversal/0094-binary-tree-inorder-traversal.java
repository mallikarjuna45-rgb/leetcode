class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode node = root;

        while (node != null || !st.isEmpty()) {
            // Go as left as possible
            while (node != null) {
                st.push(node);
                node = node.left;
            }

            // Process the top node
            node = st.pop();
            ans.add(node.val);

            // Visit the right subtree
            node = node.right;
        }

        return ans;
    }
}
