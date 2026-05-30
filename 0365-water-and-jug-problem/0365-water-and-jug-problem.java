class Solution {
    public boolean canMeasureWater(int x, int y, int target) {
        if(x+y<target)   return false;
        if(x==target || y==target)   return true;
        if(target%gcd(x,y)==0)   return true;
        return false;
    }
    public int gcd(int a,int b){
        if(b==0)  return a;
        else   return gcd(b,a%b);
    }
}