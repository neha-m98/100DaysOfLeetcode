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
    int ans = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPathSumHelper(root);
        return ans;
    }

    public int maxPathSumHelper(TreeNode root) {

         if(root == null) return 0;
         int left = maxPathSumHelper(root.left);
         int right = maxPathSumHelper(root.right);
         int max = Math.max(root.val, Math.max(Math.max(root.val+left, root.val+right), root.val+left+right)); 
         ans = Math.max(ans, max);
        return Math.max(root.val, Math.max(root.val+left, root.val+right));
    }
}
   