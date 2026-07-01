class Solution {
    public List<String> simplifiedFractions(int n) {
        List<String> list=new ArrayList<>();
        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                if(gcd(j,i)==1){
                    list.add(j+"/"+i);
                }
            }
        }
        return list;
    }
    public int gcd(int a,int b){
       if(a==0){
         return b;
       }
       return gcd(b%a,a);
    }
}