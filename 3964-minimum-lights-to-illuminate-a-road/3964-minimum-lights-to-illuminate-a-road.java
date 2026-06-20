class Solution {
    public int minLights(int[] lights) {
        int n=lights.length;
        int diff[]=new int[n+1];
        boolean flag[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(lights[i]>0){
                int left=Math.max(0,i-lights[i]);
                int right=Math.min(n-1,i+lights[i]);
                diff[left]++;
                diff[right+1]--;
            }
        }
        int run=0;
        for(int i=0;i<n;i++){
            run+=diff[i];
            flag[i]=run>0;
        }
        int ans=0;
        int i=0;
        while(i<n){
            if(flag[i]){
                i++;
                continue;
            }
            ans++;
            int pos=Math.min(n-1,i+1);
            flag[Math.max(0,pos-1)]=true;
            flag[pos]=true;
            if(pos+1<n){
                flag[pos+1]=true;
            }
            i+=3;
        }
        return ans;
    }
}