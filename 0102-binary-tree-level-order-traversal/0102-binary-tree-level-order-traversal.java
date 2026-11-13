
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        // Step 1: Store the final answer
        List<List<Integer>> ans = new ArrayList<>();

        // Step 2: Check if tree is empty
        if (root == null) {
            return ans;
        }

        // Step 3: Create a Queue
        Queue<TreeNode> q = new LinkedList<>();

        // Step 4: Insert root
        q.add(root);

        // Step 5: Process until queue becomes empty
        while (!q.isEmpty()) {

            // Number of nodes at current level
            int size = q.size();

            // Store nodes of current level
            List<Integer> level = new ArrayList<>();

            // Process all nodes of this level
            for (int i = 0; i < size; i++) {

                // Remove front node
                TreeNode curr = q.poll();

                // Store its value
                level.add(curr.val);

                // Add left child
                if (curr.left != null) {
                    q.add(curr.left);
                }

                // Add right child
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }

            // Add completed level to final answer
            ans.add(level);
        }

        return ans;
    }
}
