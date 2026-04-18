class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        k-=1;
        List<Integer> list=new ArrayList<>();
        StringBuilder sb=new StringBuilder("");
        for(int i=1;i<=n;i++){
            list.add(i);
            fact*=i;
        }
        for(int i=n;i>=1;i--){
            fact/=i;
            int x=k/fact;
            sb.append(list.get(x));
            list.remove(x);
            k%=fact;
        }
        return sb.toString();
    }
}