class Solution {
    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
        List<int[]> list=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                list.add(new int[]{arr[i],arr[j]});
            }
        }
        Collections.sort(list,(a,b)->(a[0]*b[1])-(a[1]*b[0]));
        return list.get(k-1);
    }
}