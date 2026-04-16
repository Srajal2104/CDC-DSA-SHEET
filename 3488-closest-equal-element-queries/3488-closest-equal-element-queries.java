class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n=nums.length;
        HashMap<Integer,List<Integer>> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.computeIfAbsent(nums[i],k->new ArrayList<>()).add(i);
        }
        int arr[]=new int[n];
        Arrays.fill(arr,-1);
        for(List<Integer> list : hm.values()){
            int length=list.size();
            if(length==1)  continue;
            for(int i=0;i<length;i++){
                int curr=list.get(i);
                int prev=list.get((i-1+length)%length);
                int next=list.get((i+1)%length);
                int d1=Math.abs(curr-prev);
                d1=Math.min(d1,n-d1);
                int d2=Math.abs(curr-next);
                d2=Math.min(d2,n-d2);
                arr[curr]=Math.min(d1,d2);
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int q : queries){
            ans.add(arr[q]);
        }
        return ans;
    }
}