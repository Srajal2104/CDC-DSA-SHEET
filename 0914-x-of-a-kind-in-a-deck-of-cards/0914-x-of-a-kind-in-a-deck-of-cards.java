class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        int n=deck.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(deck[i],hm.getOrDefault(deck[i],0)+1);
        }
        int gcd=0;
        for(int freq : hm.values()){
            gcd=getGCD(gcd,freq);
        }
        return gcd>=2;
    }
    public int getGCD(int a,int b){
        if(b==0)  return a;
        return getGCD(b,a%b);
    }
}