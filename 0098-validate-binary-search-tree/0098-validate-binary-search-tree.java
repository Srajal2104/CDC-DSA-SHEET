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
    public boolean isValidBST(TreeNode root) {
       return BST(root,null,null);  
    } 
    boolean BST(TreeNode node,Long low,Long high){
        if(node==null){
           return true;
        }
        if(low!=null && node.val<=low){
           return false;
        }
        if(high!=null && node.val>=high){
           return false;
        }
        return BST(node.left,low,(long)node.val) && BST(node.right,(long)node.val,high);
    }
}