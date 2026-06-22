class Solution {
    public int maxNumberOfBalloons(String text) {
        int b=0,a=0,l=0,o=0,n=0;
        for(char ch : text.toCharArray()){
            if(ch=='b')   b++;
            else if(ch=='a')   a++;
            else if(ch=='l')   l++;
            else if(ch=='o')   o++;
            else if(ch=='n')   n++;
        }        
        return Math.min(Math.min(b, a),Math.min(Math.min(l/2,o/2),n));
    }
}