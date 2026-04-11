class Solution {
    public int minOperations(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            if(i%2==0){
                while(!prime(a)){
                    a++;
                    c++;
                }
            }
            else{
                while(prime(a)){
                    a++;
                    c++;
                }
            }
        }
        return c;
    }
    public boolean prime(int n){
        if(n<=1)   return false;
        for(int i=2;i*i<=n;i++){
            if(n%i==0)  return false;
        }
        return true;
    }
}