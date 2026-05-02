class Solution {
    public int rotatedDigits(int n) {
        int c=0;
        for(int i=1;i<=n;i++){
            int num=i;
            boolean valid=true;
            boolean change=false;
            while(num>0){
                int r=num%10;
                if(r==3 || r==4 || r==7){
                    valid=false;
                    break;
                }
                if(r==2 || r==5 || r==6 || r==9){
                    change=true;
                }
                num/=10;
            }
            if(valid && change){
                c++;
            }
        }
        return c;
    }
}