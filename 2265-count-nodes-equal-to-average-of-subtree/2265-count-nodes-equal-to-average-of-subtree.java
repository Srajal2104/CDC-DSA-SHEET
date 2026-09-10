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
    int c=0;
    public int averageOfSubtree(TreeNode root) {
        count(root);
        return c;
    }
    public int[] count(TreeNode root){
        if(root==null)   return new int[]{0,0};
        int left[]=count(root.left);
        int right[]=count(root.right);
        int sum=left[0]+right[0]+root.val;
        int cnt=left[1]+right[1]+1;
        if(sum/cnt==root.val)   c++;
        return new int[]{sum,cnt};
    }
}