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
    TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> hm=new TreeMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        dfs(root,0,0);
        List<List<Integer>> ans=new ArrayList<>();
        for(TreeMap<Integer,PriorityQueue<Integer>> rows : hm.values()){
            List<Integer> list=new ArrayList<>();
            for(PriorityQueue<Integer> pq : rows.values()){
                while(!pq.isEmpty()){
                    list.add(pq.poll());
                }
            }
            ans.add(list);
        }
        return ans;
    }
    public void dfs(TreeNode root,int row,int col){
        if(root==null)  return;
        hm.putIfAbsent(col,new TreeMap<>());
        hm.get(col).putIfAbsent(row,new PriorityQueue<>());
        hm.get(col).get(row).offer(root.val);
        dfs(root.left,row+1,col-1);
        dfs(root.right,row+1,col+1);
    }
}