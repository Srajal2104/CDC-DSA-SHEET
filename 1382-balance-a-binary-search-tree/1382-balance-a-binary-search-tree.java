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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> value=new ArrayList<>();
        inorder(root,value);
        return balancing(value,0,value.size()-1);
    }
    public void inorder(TreeNode node,List<Integer> value){
        if(node==null){
            return;
        }
        inorder(node.left,value);
        value.add(node.val);
        inorder(node.right,value);
    }
    public TreeNode balancing(List<Integer> value,int left,int right){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode node=new TreeNode(value.get(mid));
        node.left=balancing(value,left,mid-1);
        node.right=balancing(value,mid+1,right);
        return node;
    }
}