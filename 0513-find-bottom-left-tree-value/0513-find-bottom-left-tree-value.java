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
    int l=-1;
    int ans=0;
    public int findBottomLeftValue(TreeNode root) {
        dfs(root,0);
        return ans;
    }
    public void dfs(TreeNode root,int level){
        if(root==null){
            return;
        }
        if(level>l){
            l=level;
            ans=root.val;
        }
        dfs(root.left,level+1);
        dfs(root.right,level+1);
    }
}