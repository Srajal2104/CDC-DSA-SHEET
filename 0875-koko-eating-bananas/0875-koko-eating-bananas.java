class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int s=1,e=0;
        for(int pile : piles){
            e=Math.max(e,pile);
        }
        while(s<e){
            int mid=s+(e-s)/2;
            if(canEat(piles,h,mid)){
                e=mid;
            }
            else{
                s=mid+1;
            }
        }
        return s;
    }

    public boolean canEat(int piles[],int h,int k){
        int hours=0;
        for(int pile : piles){
            hours+=(pile+k-1)/k;
        }
        return hours<=h;
    }
}