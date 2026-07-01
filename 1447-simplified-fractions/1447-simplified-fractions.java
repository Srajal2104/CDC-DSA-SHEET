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
        while(b!=0){
            int temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}