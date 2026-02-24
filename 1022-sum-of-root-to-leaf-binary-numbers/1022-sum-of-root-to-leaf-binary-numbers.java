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
    public int sumRootToLeaf(TreeNode root) {
        return sum(root,0);
    }
    public int sum(TreeNode root,int s){
        if(root==null){
            return 0;
        }
        s=s*2+root.val;
        if(root.left==null && root.right==null){
            return s;
        }
        return sum(root.left,s)+sum(root.right,s);
    }
}