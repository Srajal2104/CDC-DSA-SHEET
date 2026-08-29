class Solution {
    public int maxValidSplits(int[] nums) {
        int n=nums.length;
        int prefGcd[]=new int[n];
        int suffGcd[]=new int[n];
        prefGcd[0]=nums[0];
        for(int i=1;i<n;i++){
            prefGcd[i]=gcd(prefGcd[i-1],nums[i]);
        }
        suffGcd[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            suffGcd[i]=gcd(suffGcd[i+1],nums[i]);
        }
        int best=0;
        best=Math.max(best,countValid(prefGcd,suffGcd,n,-1));
        for(int r=0;r<n;r++){
            best=Math.max(best,countValidWithRemoval(nums,n,r));
        }
        return best;
    }
    private int countValid(int prefGcd[],int suffGcd[],int n,int idx){
        int c=0;
        for(int i=0;i<n-1;i++){
            if(prefGcd[i]==suffGcd[i+1]){
                c++;
            }
        }
        return c;
    }
    private int countValidWithRemoval(int nums[],int n,int r){
        int m=n-1;
        if(m<2)  return 0;
        int arr[]=new int[m];
        int index=0;
        for(int i=0;i<n;i++){
            if(i==r)  continue;
            arr[index++]=nums[i];
        }
        int pref[]=new int[m];
        int suff[]=new int[m];
        pref[0]=arr[0];
        for(int i=1;i<m;i++){
            pref[i]=gcd(pref[i-1],arr[i]);
        }
        suff[m-1]=arr[m-1];
        for(int i=m-2;i>=0;i--){
            suff[i]=gcd(suff[i+1],arr[i]);
        }
        int count=0;
        for(int i=0;i<m-1;i++){
            if(pref[i]==suff[i+1]){
                count++;
            }
        }
        return count;
    }
    private int gcd(int a,int b){
        return b==0 ? a : gcd(b,a%b);
    }
}