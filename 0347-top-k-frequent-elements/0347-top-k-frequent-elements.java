class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num : nums) {
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(
            (a,b) -> hm.get(a) - hm.get(b)
        ); //num with smaller freq comes first
        for(int key : hm.keySet()) {
            pq.add(key);
            if(pq.size()>k) pq.remove();
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++) {
            ans[i]=pq.remove();
        }
        return ans;
    }
}