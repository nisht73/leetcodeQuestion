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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if (root == null) {
            return res;
        }

        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> levelList = new ArrayList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            TreeNode currNode = q.remove();

            if (currNode == null) {
                res.add(levelList);
                levelList = new ArrayList<>();

                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                levelList.add(currNode.val);

                if (currNode.left != null) {
                    q.add(currNode.left);
                }

                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }

        return res;
    }
}