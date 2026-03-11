class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n=arr.length;
        int l=0,r=n-1;
        ArrayList<Integer> list=new ArrayList<>();
        while(r-l+1>k){
            if(x-arr[l]>arr[r]-x){
                l++;
            }
            else{
                r--;
            }
        }
        for(int i=l;i<=r;i++){
            list.add(arr[i]);
        }
        return list;
    }
}