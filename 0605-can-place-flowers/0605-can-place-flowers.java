class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int f=flowerbed.length;
        if(n==0)   return true;
        for(int i=0;i<f;i++){
            if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==f-1 || flowerbed[i+1]==0)){
                flowerbed[i]=1;
                n--;
            }
            if(n==0)  return true;
        }
        return false;
    }
}