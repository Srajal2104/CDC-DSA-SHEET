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
    int ans=0;
    public int countDominantNodes(TreeNode root) {
        ans=0;
        helper(root);
        return ans;
    }
    public int helper(TreeNode root){
        if(root==null){
            return -1;
        }
        int leftMax=helper(root.left);
        int rightMax=helper(root.right);
        int max=Math.max(root.val,Math.max(leftMax,rightMax));
        if(max==root.val){
            ans++;
        }
        return max;
    }
}