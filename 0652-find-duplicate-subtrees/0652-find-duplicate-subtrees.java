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
    Map<String, Integer> map = new HashMap<>();
    List<TreeNode> ans = new ArrayList<>();

    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        map.clear();
        ans.clear();

        serialize(root);
        return ans;
    }

    private String serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }

        String left = serialize(root.left);
        String right = serialize(root.right);

        String serial = root.val + "," + left + "," + right;

        int count = map.getOrDefault(serial, 0) + 1;
        map.put(serial, count);

        if (count == 2) {
            ans.add(root);
        }

        return serial;
    }
}
