class Solution {
    static final long mod=1000000007;
        static class Segment{
            int o,z;
            Segment(int o,int z){
                this.o=o;
                this.z=z;
            }
        }
    public int maxValue(int[] nums1, int[] nums0) {
        int n=nums1.length;
        Segment[] arr=new Segment[n];
        int m=0;
        for(int i=0;i<n;i++){
            arr[i]=new Segment(nums1[i],nums0[i]);
            m+=nums1[i]+nums0[i];
        }
        Arrays.sort(arr,(a,b)->{
            int ca=(a.z>0 ? 1 : 0);
            int cb=(b.z>0 ? 1 : 0);
            if(ca!=cb)   return ca-cb;
            if(a.o!=b.o)  return b.o-a.o;
            return a.z-b.z;
        });
        long p[]=new long[m+1];
        p[0]=1;
        for(int i=1;i<=m;i++){
            p[i]=(p[i-1]*2)%mod;
        }
        long res=0;
        for(Segment sg : arr){
            int o=sg.o;
            int z=sg.z;
            res=(res*p[o+z])%mod;
            long ans=(p[o]-1+mod)%mod;
            long v=(ans*p[z])%mod;
            res=(res+v)%mod;
        }
        return (int)res;
    }
}